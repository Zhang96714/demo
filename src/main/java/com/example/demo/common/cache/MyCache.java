package com.example.demo.common.cache;

/**
 * @author: zhangguofen
 * @date: 2022/8/30 13:29
 */
public interface MyCache {
    void putV(String key,Object value);
    Object getV(String key);
    int getCacheSize();
}
