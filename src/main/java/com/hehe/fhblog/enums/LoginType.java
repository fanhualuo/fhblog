/*
 * Copyright (c) 2014 杭州端点网络科技有限公司
 */

package com.hehe.fhblog.enums;

/**
 * 登录类型
 */
public enum LoginType {
    EMAIL(1),
    MOBILE(2),
    NICKNAME(3),

    /**
     * 本系统定义的三方用户
     */
    THIRD(10),

    /**
     * 微信
     */
    WEIXIN(20);

    private final int value;

    private LoginType(int value) {
        this.value = value;
    }

    public static LoginType from(int value) {
        for (LoginType loginType : LoginType.values()) {
            if (loginType.value == value) {
                return loginType;
            }
        }
        return null;
    }

    public int value() {
        return value;
    }

}