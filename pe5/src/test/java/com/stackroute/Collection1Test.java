package com.stackroute;


import org.junit.Test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class Collection1Test {


    Collection1 collection1 = new Collection1();

        @Test
        public void test1() {


            List<String> list1 = Arrays.asList("Apple", "Grape", "Melon", "Berry");
            List<String> list2 = Arrays.asList("Kiwi", "Grape", "Melon", "Berry");
            assertEquals(list2, collection1.update1(list1));

        }

        @Test

        public void test2() {


            List<String> list1 = Arrays.asList("kiwi", "Grape", "Melon", "Berry");
            List<String> list2 = Arrays.asList("Kiwi", "Grape", "Mango", "Berry");
            assertEquals(list2, collection1.update2(list1));

        }

        @Test

        public void test3() {


            List<String> list1 = Arrays.asList("kiwi", "Grape", "Melon", "Berry");
            List<String> list2 = Arrays.asList(" ");
            assertEquals(list2, collection1.remove(list1));

        }
}