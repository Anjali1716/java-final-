package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Collection2 {

    public Map<String, Integer> count(String actual) {

            String[] str = actual.split("\\s+|-+|\\?+|,+|\\*|_+|@+");
            int count;
            ArrayList<String> array = new ArrayList<>();
            array.addAll(Arrays.asList(str));
            array.removeAll(Arrays.asList(""));

            HashMap<String, Integer> map = new HashMap<>();
            for (String word : array) {

                if (map.containsKey(word)) {
                    count = map.get(word);
                    map.put(word, count + 1);
                } else {
                    map.put(word, 1);
                }
            }
            HashMap<String, Integer> hashMap = new HashMap<>();

            for (Map.Entry<String, Integer> entry : map.entrySet())
                hashMap.put(entry.getKey(), entry.getValue());

            return hashMap;
        }

}


