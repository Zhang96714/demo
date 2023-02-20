package com.example.demo;

import sun.reflect.Reflection;

public class D {

    private static boolean initFlag;//false
    private static byte[] initBytes;

    static {
        synchronized (D.class) {
            System.out.println("d");
        }
    }

    private String name;
    private DClass dClass = new DClass();

    private D(Void unused, String param) {
        this.name = param;
    }

    public D(String param) {
        this(checkOrNull(), param);
    }

    static synchronized void init() {
        if (!initFlag) {
            if (initBytes != null) {
                throw new IllegalStateException("recursive invocation");
            }
            //do init


            initFlag = true;//set true
        }
    }

    /**
     * do check or null
     *
     * @return null if check failed
     */
    static Void checkOrNull() {
        return null;
    }

    public static void main(String[] args) {
        new D("param").method();

    }

    void method() {
        Reflection.getCallerClass();
    }

    static class DClass {

        private DClass() {
        }

        static void printCallerClass() {
            System.out.println(Reflection.getCallerClass());
        }

        void func() {
        }
    }
}
