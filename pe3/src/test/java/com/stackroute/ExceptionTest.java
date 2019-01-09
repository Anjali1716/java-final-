package com.stackroute;

import org.junit.Test;

public class ExceptionTest {

    private Exception exceptionObj = new Exception();



    @Test
    public void negativeArrayTest(){

            String result= exceptionObj.negativeArray();
            assertEquals("class java.lang.NegativeArraySizeException",result);

    }

    @Test
    public void indexOutOfBoundArray(){

            String result = exceptionObj.indexOutOfBoundArray();
            assertEquals("class java.lang.ArrayIndexOutOfBound",result);
    }


    @Test
    public void indexOutOfBoundArray(){

            String result = exceptionObj.NullPointerException();
            assertEquals("class java.lang.NullPointerException",result);
    }
}
