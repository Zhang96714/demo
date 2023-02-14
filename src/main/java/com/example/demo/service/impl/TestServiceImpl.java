package com.example.demo.service.impl;

import com.example.demo.service.ITestService;

public class TestServiceImpl implements ITestService {

    @Override
    public void test(String arg) {
        System.out.println("test");
    }

    static void staticMethod() {
        System.out.println("call in static method.");
    }

    @Override
    public void close() {
        TestServiceImpl.staticMethod();
    }
}
