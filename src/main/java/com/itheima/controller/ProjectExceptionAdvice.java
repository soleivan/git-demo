//package com.itheima.controller;
//
//import com.itheima.exception.BusinessException;
//import com.itheima.exception.SystemException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
////通过aop思想写异常处理
//@RestControllerAdvice //rest风格开发 申明一个类作为异常处理器类
//public class ProjectExceptionAdvice {
//    @ExceptionHandler(Exception.class)
//    public Result doException(Exception ex){
//        //记录日志
//        //发送消息给运维
//        //发送邮件给开发人员
//        return new Result(Code.SYSTEM_OTHER_ERR,null,"发现异常");
//    }
//
//    @ExceptionHandler(SystemException.class)
//    public Result doSystemException(SystemException ex){
//        //记录日志
//        //发送消息给运维
//        //发送邮件给开发人员
//        return new Result(ex.getCode(),null,ex.getMessage());//这里的信息需要在自定义的异常中获取
//    }
//
//    @ExceptionHandler(BusinessException.class)
//    public Result doBusinessException(BusinessException ex){
//        return new Result(ex.getCode(),null,ex.getMessage());
//    }
//}
