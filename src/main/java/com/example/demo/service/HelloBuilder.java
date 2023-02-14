package com.example.demo.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: zhangguofen
 * @date: 2022/8/29 17:48
 */
public class HelloBuilder {

    private Class<? extends IHelloService> impl;
    private Class<? extends IHelloService> decorImpl;

    public HelloBuilder impl(Class<? extends IHelloService> impl) {
        this.impl = impl;
        return this;
    }

    public HelloBuilder decor(Class<? extends IHelloService> decorImpl) {
        this.decorImpl = decorImpl;
        return this;
    }

    public IHelloService build(){
        validation();

        IHelloService iHello;
        try {
            iHello=impl.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try{
            //获取 Constructor
            Constructor<? extends IHelloService> helloConstructor=decorImpl.getConstructor(IHelloService.class);
            return helloConstructor.newInstance(iHello);
        }catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception){
            throw new RuntimeException(exception);
        }
    }

    /**
     * 校验
     */
    private void validation(){
        assert impl!=null;
        assert decorImpl!=null;
    }
}
