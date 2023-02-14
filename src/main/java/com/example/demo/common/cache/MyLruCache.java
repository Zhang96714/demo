package com.example.demo.common.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: zhangguofen
 * @date: 2022/8/26 16:17
 */
public class MyLruCache extends LinkedHashMap<String,Object> implements MyCache{

    public static final int MAX_SIZE=5;

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Object> eldest) {
        return size() > MAX_SIZE;
    }

    @Override
    public void putV(String key, Object value) {
        this.put(key, value);
    }

    @Override
    public Object getV(String key) {
        return this.get(key);
    }

    @Override
    public int getCacheSize() {
        return size();
    }
}
