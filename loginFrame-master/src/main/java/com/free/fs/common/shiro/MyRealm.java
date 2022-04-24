package com.free.fs.common.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.free.fs.common.constant.CommonConstant;
import com.free.fs.mapper.UserMapper;
import com.free.fs.model.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义认证授权处理逻辑
 *
 * @author zhangqi
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        // 往数据库中查询用户
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUsername, username));
        if (user == null) {
            // 账号不存在
            throw new UnknownAccountException();
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes(CommonConstant.DEFAULT_SALT), getName());

    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
