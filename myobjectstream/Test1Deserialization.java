package com.itheima.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test1Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\objecttest.txt"));

        ArrayList<Teacher> list = (ArrayList<Teacher>)ois.readObject();

        for (Teacher teacher : list) {
            System.out.println(teacher);
        }

        ois.close();


    }
}
