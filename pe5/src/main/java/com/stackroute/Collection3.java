package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public Map<String, Boolean> findOccurrence(String[] actual) {

        Map<String,Boolean> map=new HashMap<>();
        boolean boolVal;
        for(String str:actual)
        {
            if(!map.containsKey(str))
            {
                boolVal=false;
                map.put(str,boolVal);

            }
            else
            {
                boolVal=true;
                map.put(str,boolVal);
            }
        }
        return map;
    }
}
