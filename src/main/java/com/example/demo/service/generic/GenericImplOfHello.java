package com.example.demo.service.generic;

import com.example.demo.service.impl.HelloServiceImpl;
import com.example.demo.service.IHelloService;

/**
 * @author: zhangguofen
 * @date: 2023/1/13 13:08
 */
public class GenericImplOfHello extends  GenericServiceDef{

    @Override
    protected String getBeanName() {
        return "HelloServiceImpl";
    }

    @Override
    protected Class<?> getServiceClass() {
        return IHelloService.class;
    }

    @Override
    protected Object getBean() {
        return new HelloServiceImpl();
    }
}
