package com.itheima.a01staticdemo1ClassVariables;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setSex("男");

        //static修饰过后，不管谁调用teacherName，数据都是共享！！！的
        //会跟类一起进堆内存，加载静态区
        //！！！优先于对象出现的
        Student.teacherName = "阿伟老师";

        s1.show();


        Student s2= new Student();
        s2.setName("李四");

        s2.setSex("女");

        s2.show();


    }
}
