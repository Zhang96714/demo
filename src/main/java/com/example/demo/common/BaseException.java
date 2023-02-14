package com.example.demo.common;

public interface BaseException {

    void func1() throws CException;

    void func2() throws CRException;

    /**
     * 必须使用 Exception 的子类
     *
     * @throws Exception e
     */
    @Deprecated
    void func3() throws Exception;

}
