package com.example.demo.service.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

/**
 * 定义泛型方法信息
 *
 * @author: zhangguofen
 * @date: 2023/1/13 13:07
 */
public abstract class GenericServiceDef {

    protected abstract String getBeanName();

    protected abstract Class<?> getServiceClass();

    protected abstract  Object getBean();

    /**
     * 包内可用，通过InterfaceCallContext#invoke()进行调用
     *
     * @param target
     * @param paramTypes
     * @param params
     * @return
     */
    void invoke(String target,String[] paramTypes,Object[] params){
        Object bean=getBean();
        Class<?> c=getServiceClass();

        try {
            Method method=c.getDeclaredMethod(target);
            CompletableFuture<Void> future=CompletableFuture.runAsync(()->{
                try {
                    method.invoke(bean);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            });
            InterfaceCallContext.getContext().setCompletableFuture(future);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        GenericServiceDef genericServiceDef=new GenericImplOfHello();
        //方法调用
        InterfaceCallContext.invokeAsync(genericServiceDef,"sayHello");
        CompletableFuture<String> future= InterfaceCallContext.getResult();

        CountDownLatch countDownLatch=new CountDownLatch(1);
        System.out.println("等待执行结束");
        future.whenComplete((s, throwable) -> {
            System.out.println("执行完成:"+s);
            countDownLatch.countDown();

        });

        Thread.currentThread().interrupt();//中断当前线程, true
        System.out.println(Thread.interrupted());//false
        System.out.println(Thread.currentThread().isInterrupted());//false

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            /*
             * 中断标识被重置可能
             * 1 await()
             * 2 手动调用Thread.interrupted()
             */
//            System.out.println(Thread.currentThread().isInterrupted());//false
            throw new RuntimeException(e);
        }


    }
}
