package com.example.demo.service.generic;

import com.example.demo.service.impl.TestServiceImpl;

public class GenericImplOfTest extends GenericServiceDef{
    @Override
    protected String getBeanName() {
        return "TestServiceImpl";
    }

    @Override
    protected Class<?> getServiceClass() {
        return GenericImplOfTest.class;
    }

    @Override
    protected Object getBean() {
        return new TestServiceImpl();
    }
}
