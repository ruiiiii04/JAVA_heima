package com.itheima.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //文件加密
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\ency.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\reduction.txt");

        int b;
        while((b = fis.read()) != -1){
            //异或多少都可以
            fos.write(b ^ 2);
        }

        fis.close();
        fos.close();



    }
}
