package com.stackroute;


import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static junit.framework.TestCase.assertEquals;

public class Collection5Test {

    Collection5 collection5=new Collection5();

    @Test
    public void test1(){

        Map<String,String> actual=new HashMap<>();
        actual.put("val1","java");
        actual.put("val2","C++");
        Map<String,String> expected=new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","java");
        assertEquals(expected,collection5.replace(actual));
    }

    @Test
    public void test2(){

        Map<String,String> actual=new HashMap<>();
        actual.put("val1","Ruby");
        actual.put("val2","Python");
        Map<String,String> expected=new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","Ruby");
        assertEquals(expected,collection5.replace(actual));

    }

    @Test
    public void test3(){

        Map<String,String> actual=new HashMap<>();
        actual.put("val1","C#");
        actual.put("val2","Php");
        Map<String,String> expected=new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","C#");
        assertEquals(expected,collection5.replace(actual));

    }


}
