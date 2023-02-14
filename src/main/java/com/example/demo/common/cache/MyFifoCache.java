package com.example.demo.common.cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 *
 * @author: zhangguofen
 * @date: 2022/8/30 13:30
 */
public class MyFifoCache extends HashMap<String,Object> implements MyCache{
    private final Deque<String> list=new LinkedList<>();
    @Override
    public void putV(String key, Object value) {
        cycleList(key);
        super.put(key, value);
    }

    @Override
    public Object getV(String key) {
        return super.get(key);
    }

    @Override
    public int getCacheSize() {
        return size();
    }

    /**
     * remove old key from list
     *
     * @param key
     */
    private void cycleList(String key){
        list.addLast(key);
        int size = 10;//最大缓存个数
        if(list.size() > size){
            //first
            super.remove(list.removeFirst());
        }
    }
}
