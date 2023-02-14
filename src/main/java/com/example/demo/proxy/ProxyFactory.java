package com.example.demo.proxy;

import com.example.demo.service.IHelloService;

import java.lang.reflect.Proxy;

/**
 * 简单例子
 *
 * @author: zhangguofen
 * @date: 2022/8/23 18:10
 */
public class ProxyFactory {

    Object createProxy(ProxyHandler proxyHandler){
        return Proxy.newProxyInstance(getClass().getClassLoader(),new Class[]{IHelloService.class},proxyHandler);
    }

    public Object createProxy(){
        IHelloService iHello=new IHelloService() {
            @Override
            public void sayHello() {
                System.out.println("开始执行 sayHello 方法");
            }
        };
        return createProxy(new ProxyHandler(iHello));
    }
}
