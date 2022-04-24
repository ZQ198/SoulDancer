package com.free.fs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.free.fs.common.constant.CommonConstant;
import com.free.fs.common.exception.BusinessException;
import com.free.fs.common.shiro.EndecryptUtil;
import com.free.fs.mapper.UserMapper;
import com.free.fs.model.User;
import com.free.fs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 用户业务接口实现
 *
 * @author zhangqi
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean addUser(User user) {
        user.setPassword(EndecryptUtil.encrytMd5(user.getPassword(), CommonConstant.DEFAULT_SALT, CommonConstant.DEFAULT_HASH_COUNT));
        if (baseMapper.insert(user) <= 0) {
            throw new BusinessException("用户新增失败");
        }
        return true;
    }

    /**
     * 修改密码（找回密码）
     * @param userForm
     * @return
     */
    @Override
    public boolean updateByEmail(User userForm) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",userForm.getUsername());
        User user = baseMapper.selectOne(wrapper);//根据邮箱账号查询到的用户
        if(!StringUtils.isEmpty(user)){
            user.setPassword(EndecryptUtil.encrytMd5(userForm.getPassword(),CommonConstant.DEFAULT_SALT, CommonConstant.DEFAULT_HASH_COUNT));//修改密码核心，将表单输入的密码加密，再修改数据库中原密码
            baseMapper.updateById(user);
            return true;
        }
        return false;
    }
}
