package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;

public class Collection6Test {

    Collection6 collection6=new Collection6();

        @Test
        public void setInter1()
        {
            String[] actual={"Harry","Olive","Alice","Bluto","Eugene"};
            Set expected=new HashSet<String>();
            expected.add("Alice");
            expected.add("Bluto");
            expected.add("Eugene");
            expected.add("Harry");
            expected.add("Olive");
            assertEquals(expected,collection6.setSort(actual));

            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(expected);

            assertEquals(arrayList, collection6.setSortArr(expected));

        }


    @Test
    public void setInter2()
    {
        String[] actual={"Marry","Olis","Jay","Pluto","Aron"};
        Set expected=new HashSet<String>();
        expected.add("Aron");
        expected.add("Jay");
        expected.add("Marry");
        expected.add("Olis");
        expected.add("Pluto");
        assertEquals(expected,collection6.setSort(actual));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(expected);

        assertEquals(arrayList, collection6.setSortArr(expected));

    }
}

