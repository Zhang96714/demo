package com.example.demo.plugin;

/**
 * @author: zhangguofen
 * @date: 2022/8/30 16:13
 */
public interface MyPlugin {

    /**
     * 拦截操作
     *
     * @param invocation 方法调用封装
     * @return 方法执行结果
     */
    Object interceptor(MyInvocationInfo invocation);

    /**
     * 添加新的插件
     *
     * @param target 目标对象
     * @return 产生的新对象
     */
    Object plugin(Object target);

    default boolean skip(MyInvocationInfo invocationInfo) {
        return false;
    }

}
