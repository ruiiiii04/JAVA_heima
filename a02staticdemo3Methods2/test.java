package com.itheima.a02staticdemo3Methods2;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 28, "男");
        Student stu2 = new Student("李四", 30, "女");
        Student stu3 = new Student("王五", 25, "男");

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int oldestAge = StudentUtil.getOldest(list);

        System.out.println(oldestAge);

    }
}
