package com.example.demo.service.impl;

import com.example.demo.service.IHelloService;

/**
 * @author: zhangguofen
 * @date: 2022/8/3 14:40
 */
public class HelloServiceImpl implements IHelloService {

    /**
     * Thread#sleep() 模拟耗时
     */
    @Override
    public void sayHello() {
        System.out.println("start hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end hello");
    }
}
