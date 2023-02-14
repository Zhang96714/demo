package com.example.demo.plugin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 工具类
 *
 * @author: zhangguofen
 * @date: 2022/8/30 16:32
 */
public class Plugins {

    public static Object newProxyObj(Class<?> targetInterface,ClassLoader classLoader ,InvocationHandler invocationHandler){
        return  Proxy.newProxyInstance(classLoader,new Class[]{targetInterface},invocationHandler);
    }
}
