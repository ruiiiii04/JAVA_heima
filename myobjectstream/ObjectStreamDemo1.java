package com.itheima.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("zhangsan", 23, "南京");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\objecttest.txt"));

        oos.writeObject(stu);

        oos.close();




    }
}
