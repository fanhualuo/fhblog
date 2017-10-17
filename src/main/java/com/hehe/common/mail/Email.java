package com.hehe.common.mail;

import lombok.Data;

/**
 * Date: 2017/8/31
 * Time: 下午2:37
 * Author: xieqinghe .
 */
@Data
public class Email {


    /** 发件人 **/
    private String fromAddress;

    /** 收件人 **/
    private String toAddress;

    /** 邮件主题 **/
    private String subject;

    /** 邮件内容 **/
    private String content;

}
