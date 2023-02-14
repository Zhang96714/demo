package com.example.demo.common.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 *
 *
 * @author: zhangguofen
 * @date: 2022/8/31 14:47
 */
public interface Invoker {
    Object invoke(Object target,Object[] args) throws IllegalAccessException, InvocationTargetException;
}
