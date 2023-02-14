package com.example.demo.common.context;

/**
 * 错误上下文信息
 *
 * @author: zhangguofen
 * @date: 2022/8/30 11:39
 */
public class ErrorContext {
    private static final ThreadLocal<ErrorContext> LOCAL=new ThreadLocal<>();
    private String message;
    private Throwable cause;

    /**
     * 创建实例
     *
     * @return
     */
    public static ErrorContext getInstance(){
        if(null == LOCAL.get()){
            ErrorContext context=new ErrorContext();
            LOCAL.set(context);
        }
        return LOCAL.get();
    }

    /**
     * 设置 错误信息
     *
     * @param message
     * @return
     */
    public ErrorContext message(String message){
        this.message=message;
        return this;
    }

    /**
     * 设置 异常信息
     *
     * @param throwable
     * @return
     */
    public ErrorContext err(Throwable throwable){
        this.cause=throwable;
        return this;
    }

    /**
     * 重置方法
     */
    public void reset(){
        this.cause=null;
        this.message=null;

        LOCAL.remove();
    }
}
