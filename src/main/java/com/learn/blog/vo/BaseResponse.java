package com.learn.blog.vo;

import com.learn.blog.constant.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by 一伞烟雨 on 2018/3/12.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
    private int code;

    private String message;

    private Object data;

    public BaseResponse(int code, String message){
        this.code = code;
        this.message = message;
    }

    public BaseResponse(ExceptionEnum exceptionEnum){
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }

    /**
     * 成功
     */
    public static BaseResponse ok(){
        return new BaseResponse(200, "success");
    }

    /**
     * 失败
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(Integer code,String message){
        return new BaseResponse(code, message);
    }

    /**
     * 成功
     */
    public static BaseResponse ok(Object object){
        return new BaseResponse(200, "success", object);
    }

}
