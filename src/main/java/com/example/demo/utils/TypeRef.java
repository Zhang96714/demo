package com.example.demo.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 简单类型工具
 *
 * @author: zhangguofen
 * @date: 2022/8/24 17:37
 */
public abstract class TypeRef<T> {

    private final Type rawType;

    protected TypeRef() {
        this.rawType = getSuperClassParameter(getClass());
    }

    /**
     * 获取泛型信息
     *
     * @param aClass class
     * @return type
     */
    private Type getSuperClassParameter(Class<?> aClass) {
        Type superClass=aClass.getGenericSuperclass();
        if(superClass instanceof ParameterizedType){
            ParameterizedType parameterizedType=(ParameterizedType) superClass;
            return parameterizedType.getActualTypeArguments()[0];
        }

        //不符合预期，缺少具体值
        if(TypeRef.class == superClass){
            throw new RuntimeException("缺少 T");
        }
        return getSuperClassParameter(superClass.getClass());
    }
    public Type getRawType() {
        return rawType;
    }
}
