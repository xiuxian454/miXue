package com.dfrz.mixue.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

//统一返回值
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult {
    //是否成功
    private Boolean success;
    //状态码
    private Integer code;
    //消息
    private String message;
    //数据
    Map<String, Object> data;

    public static BaseResult result(Map<String,Object> data,Integer code,String message){
        return new BaseResult(code,message,data);
    }


    public BaseResult(Integer code, String message, Map<String, Object> data) {
        this.code = code;
        this.message = message;
        this.data = data;

    }

    //通用方法-成功
    public static BaseResult successResult() {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        baseResult.setCode(ResultCodeEnum.SUCCESS.getCode());
        baseResult.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return baseResult;
    }

    //通用方法-异常
    public static BaseResult exceptionResult() {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(ResultCodeEnum.FAILURE.getSuccess());
        baseResult.setCode(ResultCodeEnum.FAILURE.getCode());
        baseResult.setMessage(ResultCodeEnum.FAILURE.getMessage());
        return baseResult;
    }

    //通用方法-自定义异常
    public static BaseResult myExceptionResult(ResultCodeEnum result, String message, Map<String, Object> data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(result.getSuccess());
        baseResult.setCode(result.getCode());
        baseResult.setMessage(message);
        baseResult.setData(data);
        return baseResult;
    }

    //通用方法
    public static BaseResult setResult(ResultCodeEnum result, Map<String, Object> data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(result.getSuccess());
        baseResult.setCode(result.getCode());
        baseResult.setMessage(result.getMessage());
        baseResult.setData(data);
        return baseResult;
    }
}
