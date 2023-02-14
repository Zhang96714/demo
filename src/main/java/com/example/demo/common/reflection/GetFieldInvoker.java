package com.example.demo.common.reflection;

import java.lang.reflect.Field;

/**
 * 字段获取
 *
 * @author: zhangguofen
 * @date: 2022/8/31 14:48
 */
public class GetFieldInvoker implements Invoker{

    private final Field field;

    public GetFieldInvoker(Field field) {
        this.field = field;
    }

    @Override
    public Object invoke(Object target, Object[] args) throws IllegalAccessException {
        if(!field.isAccessible()){
            field.setAccessible(true);
        }
        return field.get(target);
    }
}
