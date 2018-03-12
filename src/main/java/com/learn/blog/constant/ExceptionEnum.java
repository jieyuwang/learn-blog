package com.learn.blog.constant;

/**
 * @author Created by 一伞烟雨 on 2018/3/12.
 */
public enum ExceptionEnum {
    //系统层次异常
    // 业务级别异常
      ;
    private int code;
    private String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
