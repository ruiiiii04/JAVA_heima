package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Prac1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\a.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\acopy.txt");

        int len;
        byte[] bytes = new byte[1024 * 1024 * 2];

        while((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0,len);
        }

        //abcde
        fos.close();
        fis.close();


    }
}
