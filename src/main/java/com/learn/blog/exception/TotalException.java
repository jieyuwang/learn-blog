package com.learn.blog.exception;

/**
 * @author Created by 一伞烟雨 on 2018/3/12.
 */

/**
 * 统一异常
 */
public class TotalException extends RuntimeException {

    public TotalException(String message){
        super(message);
    }
}
