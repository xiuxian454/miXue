package com.dfrz.mixue.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//统一异常处理
@ControllerAdvice
public class ExceptionAutoUtil {

private static final Logger log = LoggerFactory.getLogger(ExceptionAutoUtil.class);

    //捕获系统运行时异常
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)//所捕获的异常的类型
    public BaseResult error1(RuntimeException re) {
        //记录日志
        re.printStackTrace();
		log.error(re.getMessage());
        return BaseResult.setResult(ResultCodeEnum.FAILURE, null);
    }

    //捕获自定义异常
    @ResponseBody
    @ExceptionHandler(MyException.class)//所捕获的异常的类型
    public BaseResult error2(MyException me) {
        //记录日志
        me.printStackTrace();
		log.error(me.getMessage());
        return BaseResult.myExceptionResult(ResultCodeEnum.FAILURE, me.getMessage(), null);
    }

}
