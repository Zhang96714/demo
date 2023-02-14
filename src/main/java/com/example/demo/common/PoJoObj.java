package com.example.demo.common;

/**
 * @author: zhangguofen
 * @date: 2023/1/13 12:24
 */
public class PoJoObj {

   static  {
        System.out.println("init obj in static init block");
    }

    {
        System.out.println("init obj in init block");
    }

    public PoJoObj(){
        System.out.println("init obj in constructor method");
    }
}
