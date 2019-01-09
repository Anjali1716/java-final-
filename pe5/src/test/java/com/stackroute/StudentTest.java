package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class StudentTest {

    Student student=new Student();
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;




    @Test
    public void compare() {
        List<Student> actual= new ArrayList<>();
        actual.add(student1);
        actual.add(student2);
        actual.add(student3);
        actual.add(student4);
        actual.add(student5);

        List<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student4);
        expected.add(student2);
        expected.add(student3);
        expected.add(student5);

        assertEquals(expected, student.sortingStudent(actual));


    }
}



