package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        boolean result=false;
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Map.Entry<Integer, Integer> item: functionMap.entrySet()) {
            if(item.getValue().equals(requiredValue)){
                result=true;
            }
        }
        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer item: sourceList) {
            map.put(item,5*item+2);
        }

        return map;
    }
}
