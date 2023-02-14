package com.example.demo.service;

/**
 * 测试接口
 *
 * @author: zhangguofen
 * @date: 2022/8/30 16:26
 */
public interface ITestService extends AutoCloseable {

    /**
     * 测试方法
     *
     * @param arg 参数
     */
    void test(String arg);

    /**
     * close 方法
     */
    @Override
    default void close() {
    }
}
