package com.example.demo.service.generic;

import java.util.concurrent.CompletableFuture;

/**
 * 调用的上下文对象
 *
 * @author: zhangguofen
 * @date: 2023/1/13 12:55
 */
public class InterfaceCallContext {

    private static final ThreadLocal<InterfaceCallContext> THREAD_LOCAL=new ThreadLocal<>();

    /**
     * 执行结果
     */
    private CompletableFuture<?> completableFuture;
    public static InterfaceCallContext getContext(){
        if(THREAD_LOCAL.get() == null){
            THREAD_LOCAL.set(new InterfaceCallContext());
        }
        return THREAD_LOCAL.get();
    }

    @SuppressWarnings("all")
    public static <T>  CompletableFuture<T> getResult() {
        return (CompletableFuture<T>) getContext().getCompletableFuture();
    }
    public static void invokeAsync(GenericServiceDef serviceDef,String method){
        invokeAsync(serviceDef,method,null,null);
    }

    public static void invokeAsync(GenericServiceDef serviceDef,String method,String[] p,Object[] v){
        serviceDef.invoke(method,p,v);
    }
    public CompletableFuture<?> getCompletableFuture() {
        return completableFuture;
    }
    public void setCompletableFuture(CompletableFuture<?> completableFuture) {
        this.completableFuture = completableFuture;
    }

}
