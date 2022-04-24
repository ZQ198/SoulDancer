package com.free.fs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.free.fs.model.User;

/**
 * 用户表业务接口
 *
 * @author zhangqi
 */
public interface UserService extends IService<User> {

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    boolean updateByEmail(User user);
}
