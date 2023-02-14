package com.example.demo.plugin.impl;

import com.example.demo.plugin.MyInvocationInfo;
import com.example.demo.plugin.MyPlugin;
import com.example.demo.plugin.Plugins;
import com.example.demo.service.ITestService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 打印方法执行时间
 *
 * @author: zhangguofen
 * @date: 2022/8/30 16:31
 */
public class InvokeCostPlugin implements MyPlugin {

    private static final Set<String> SKIP_METHODS = new HashSet<>(
            Arrays.asList("close", "demo")
    );

    @Override
    public Object interceptor(MyInvocationInfo invocation) {
        Object result;

        try {
            boolean skip = skip(invocation);
            if (skip) {
                return invocation.getMethod().invoke(invocation.getTarget(), invocation.getArgs());
            }

            long s = System.currentTimeMillis();
            result = invocation.getMethod().invoke(invocation.getTarget(), invocation.getArgs());
            System.out.println("cost:" + (System.currentTimeMillis() - s));
            return result;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean skip(MyInvocationInfo invocationInfo) {
        return SKIP_METHODS.contains(invocationInfo.getMethod().getName());
    }

    @Override
    public Object plugin(Object target) {
        return Plugins.newProxyObj(ITestService.class, getClass().getClassLoader(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return interceptor(new MyInvocationInfo(method, target, args));
            }
        });
    }
}
