package com.example.demo.plugin.impl;

import com.example.demo.plugin.MyInvocationInfo;
import com.example.demo.plugin.MyPlugin;
import com.example.demo.plugin.Plugins;
import com.example.demo.service.ITestService;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 打印方法执行参数值
 *
 * @author: zhangguofen
 * @date: 2022/8/30 16:15
 */
public class ParamPrintPlugin implements MyPlugin {

    @Override
    public Object interceptor(MyInvocationInfo invocation) {
        Object result;
        try {
            printArgs(invocation.getArgs(), invocation.getMethod());
            //执行原始方法
            result=invocation.getMethod().invoke(invocation.getTarget(),invocation.getArgs());
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private void printArgs(Object[] args,Method method){
        StringBuilder ar=new StringBuilder();
        for (Object p:args) {
            ar.append(p).append(",");
        }
        if(StringUtils.hasLength(ar)){
            ar.deleteCharAt(ar.length()-1);
        }
        System.out.println(method.getName()+":"+ar);
    }

    @Override
    public Object plugin(Object target) {

        return Plugins.newProxyObj(ITestService.class, getClass().getClassLoader(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        MyInvocationInfo invocation=new MyInvocationInfo(method,target,args);
                        return interceptor(invocation);
                    }
                });
    }
}
