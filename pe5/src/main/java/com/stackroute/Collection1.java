package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection1 {
    

    public List<String> update1(List<String> list1) {

        list1.set(0, "kiwi");
        return list1;
    }

    public List<String> update2(List<String> list1) {
        list1.set(2, "Mango");
        return list1;
    }

    public List<String> remove(List<String> list1) {
        list1.clear();
        return list1;
    }

}
