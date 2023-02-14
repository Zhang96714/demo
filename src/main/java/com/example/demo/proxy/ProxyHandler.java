package com.example.demo.proxy;

import com.example.demo.service.IHelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 简单例子
 *
 * @author: zhangguofen
 * @date: 2022/8/23 18:01
 */
public class ProxyHandler implements InvocationHandler {

    private final IHelloService action;

    public ProxyHandler(IHelloService action) {
        this.action = action;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object r;
       if(Object.class.equals(method.getDeclaringClass())){
           System.out.println("skip proxy,current method name:"+method.getName());
           r=method.invoke(this,args);
       }else {
           long time=mockCost();
           r=method.invoke(this.action,args);
           System.out.println("print run time cost:"+(System.currentTimeMillis()-time));
       }
        return r;
    }

    /**
     * 模拟耗时
     *
     * @return 时间花费
     */
    private long mockCost(){
        long s=System.currentTimeMillis();
        ThreadLocalRandom random=ThreadLocalRandom.current();
        try {
            Thread.sleep(random.nextInt(200));
        }catch (Exception e){
            // ignore
        }
        return s;
    }
}
