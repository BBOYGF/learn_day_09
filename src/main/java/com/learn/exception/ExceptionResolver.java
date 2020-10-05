package com.learn.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        //获取到异常对象
        exception e=null;
        if(ex instanceof exception)
        {
            e= (exception) ex;
        }else
        {
            e=new exception("暂时没有这个异常处理类！");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errMsg",e.getMessage());
        modelAndView.setViewName("excetionResolver");
        return modelAndView;
    }
}
