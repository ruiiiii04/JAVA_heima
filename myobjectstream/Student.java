package com.itheima.myobjectstream;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {


    @Serial
    private static final long serialVersionUID = -6357601841666449654L;
    private String name;
    private int age;


    //如果不想序列化到文件
    //transient
    private transient String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
