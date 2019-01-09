package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class Collection3Test {

    Collection3 collection3=new Collection3();

    @Test
    public void test1(){

        String actual[] = {"a","b","c","a","c","c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        assertEquals(expected,collection3.findOccurrence(actual));
    }

    @Test
    public void test2(){

        String actual[] = {"a","b","b","b","c","c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a",false);
        expected.put("b",true);
        expected.put("c",true);
        assertEquals(expected,collection3.findOccurrence(actual));
    }

    @Test
    public void test3(){

        String actual[] = {"5","8","4","4","5","5"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("5",true);
        expected.put("8",false);
        expected.put("4",true);
        assertEquals(expected,collection3.findOccurrence(actual));
    }

}
