package com.example.demo.service.spi;

import com.example.service.ServiceProvider;

/**
 * spi接口具体实现类
 *
 */
public class SimpleService implements ServiceProvider {

    @Override
    public void doSomeThings() {
        System.out.println("hello hello.");
    }
}
