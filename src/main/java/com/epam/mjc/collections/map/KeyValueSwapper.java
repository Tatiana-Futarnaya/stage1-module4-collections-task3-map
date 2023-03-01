package com.epam.mjc.collections.map;


import java.util.LinkedHashMap;
import java.util.Map;


public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map=new LinkedHashMap<>();
        for (Map.Entry<Integer,String> e: sourceMap.entrySet()) {
            map.put(e.getValue(),e.getKey());
        }
        return map;
    }
}
