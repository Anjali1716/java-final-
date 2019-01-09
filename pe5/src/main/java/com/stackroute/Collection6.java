package com.stackroute;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Collection6{

        Set<String> setSort(String[] actual){

            TreeSet<String> set=new TreeSet<String>();
            for (String str:actual) {
                set.add(str);
            }
            return set;

        }


    public ArrayList<String> setSortArr(Set expected) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(expected);
        return  arrayList;
    }
}
