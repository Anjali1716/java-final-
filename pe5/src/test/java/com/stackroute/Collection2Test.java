package com.stackroute;


import org.junit.Test;
import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

public class Collection2Test {

    Collection2 collection2=new Collection2();

    @Test
    public void test1(){

        String actual = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,collection2.count(actual));

    }

    @Test
    public void test2(){

        String actual = "one two -one___two,,three,one @three*one?three";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",4);
        expected.put("two",1);
        expected.put("three",3);
        assertEquals(expected,collection2.count(actual));

    }

    @Test
    public void test3(){

        String actual = "one three -one___two,,three,two @three*two?two";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one",2);
        expected.put("two",4);
        expected.put("three",3);
        assertEquals(expected,collection2.count(actual));

    }


}
