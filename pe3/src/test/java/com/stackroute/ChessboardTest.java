package com.stackroute;

import org.junit.Test;

public class ChessboardTest {

    Chessboard chessboard=new Chessboard();


    @Test
    public void test1() {
        String[][] value = {{"WW|", "BB|", "WW|", "BB|", "WW|"}};
        String result = chessboard.makeChessboard(1, 5);
        assertEquals(value, result);
    }

    @Test
    public void test2(){

        String[][] value={ {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}};
        String result=chessboard.makeChessboard(4,8);
        assertEquals(value, result);
    }


    @Test
    public void test3() {
        String[][] value = {{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}};
        String result = chessboard.makeChessboard(8, 12);
        assertNotEquals(value, result);
    }

    @Test
    public void test4(){

        String[][] value={ {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}};
        String result=chessboard.makeChessboard(4,6);
        assertNotEquals(value, result);
    }



}
