package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        String[] arr=sentence.split("[\\W\\s*]");
        for (String item:arr) {
            if(!item.equals("")){
                list.add(item.toLowerCase(Locale.ROOT));
            }
        }

        for (String item: list) {
            int newValue= map.getOrDefault(item,0)+1;
            map.put(item,newValue);
        }
        return map;
    }
}
