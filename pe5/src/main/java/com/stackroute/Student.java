package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

    private Integer id;
    private String name;
    private Integer age;


    public Student(){
        super();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Student> sortingStudent(List<Student> sList){
        Collections.sort(sList, new StudentSorter());
        Collections.reverse(sList);
        List<Student> stList=new ArrayList<>();
        Student ss=null;
        for(Student student : sList) {
            stList.add(student);
        }
        return stList;


    }
}
