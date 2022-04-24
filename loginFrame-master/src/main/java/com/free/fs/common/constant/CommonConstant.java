package com.free.fs.common.constant;

/**
 * 全局公共常量
 *
 * @author zhangqi
 */
public interface CommonConstant {

    /**
     * 路径目录分隔符
     */
    String DIR_SPLIT = "/";

    /**
     * 字符串分隔符
     */
    String STRING_SPLIT = ",";

    /**
     * 后缀分隔符
     */
    String SUFFIX_SPLIT = ".";

    /**
     * 目录默认类型
     */
    String DEFAULT_DIR_TYPE = "dir";

    /**
     * 默认管理员角色code
     */
    String ROLE_ADMIN = "admin";

    /**
     * 默认普通角色code
     */
    String ROLE_USER = "user";

    /**
     * 默认树顶级id
     */
    Long ROOT_PARENT_ID = -1L;

    /**
     * dtree指定图标
     */
    String DTREE_ICON_1 = "dtree-icon-weibiaoti5";

    /**
     * dtree指定图标
     */
    String DTREE_ICON_2 = "dtree-icon-normal-file";

    /**
     * 密码加密盐值
     */
    String DEFAULT_SALT = "jiami";

    /**
     * 密码加密散列次数
     */
    int DEFAULT_HASH_COUNT = 3;

    String X_REQUESTED_WITH = "X-Requested-With";

    String XML_HTTP_REQUEST = "XMLHttpRequest";
}
