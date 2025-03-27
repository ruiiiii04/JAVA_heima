package com.itheima.myobjectstream;

import java.io.Serial;
import java.io.Serializable;

public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = -3014440042890768178L;
    private String name;
    private int age;
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
