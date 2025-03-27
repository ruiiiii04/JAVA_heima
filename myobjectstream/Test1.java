package com.itheima.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //将多个自定义对象序列化到文件中，但是对象的个数不确定
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\objecttest.txt"));

        Teacher t1 = new Teacher("Rama", 30, "OS");
        Teacher t2 = new Teacher("Raymond", 30, "Eng");
        Teacher t3 = new Teacher("Foad", 40, "SQL");

        ArrayList<Teacher> list = new ArrayList<>();

        Collections.addAll(list, t1,t2,t3);

        oos.writeObject(list);

        oos.close();




    }
}
