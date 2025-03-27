package com.itheima.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\objecttest.txt"));
        Student o = (Student)ois.readObject();

        System.out.println(o);

        ois.close();
    }
}
