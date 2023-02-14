package com.example.demo.common;

public class CException extends Exception implements BaseException {

    public static void main(String[] args) {
        try {
            new CException().func1();//normal exception
        } catch (CException e) {
            throw new RuntimeException(e);
        }

        new CException().func2();//runningTime exception

        try {
            new CException().func3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void func1() throws CException {

    }

    @Override
    public void func2() throws CRException {

    }

    @Override
    public void func3() throws Exception {

    }
}
