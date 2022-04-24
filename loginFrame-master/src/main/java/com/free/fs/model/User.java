package com.free.fs.model;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * 用户表实体
 *
 * @author zhangqi
 */
@Data
@TableName("sys_user")
@EqualsAndHashCode(callSuper = true)
public class User extends Model<User> {

    /**
     * 自增id
     */
    @TableId
    private Long id;

    /**
     * 邮箱账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称（用户名）
     */
    private String nickName;

    /**
     * 注册时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 逻辑删除（1-已删除，0-未删除）
     */
    private Integer isDeleted;

    /**
     * 角色集合,exist表示数据库中不存在，但又必须使用
     */
    @TableField(exist = false)
    private List<String> roleList;

    /**
     * 权限集合
     */
    @TableField(exist = false)
    private List<String> authList;
}
