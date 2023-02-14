package com.example.demo.plugin;

import java.lang.reflect.Method;

/**
 * 调用封装
 *
 * @author: zhangguofen
 * @date: 2022/8/30 16:13
 */
public class MyInvocationInfo {

    private final Method method;
    private final Object target;
    private final Object[] args;

    public MyInvocationInfo(Method method, Object target, Object[] args) {
        this.method = method;
        this.target = target;
        this.args = args;
    }

    public Method getMethod() {
        return method;
    }

    public Object getTarget() {
        return target;
    }

    public Object[] getArgs() {
        return args;
    }
}
