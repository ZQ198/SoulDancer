package com.free.fs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.free.fs.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表mapper接口
 *
 * @author zhangqi
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
