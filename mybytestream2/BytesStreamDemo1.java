package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class BytesStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\a.txt");
        int b;
        while((b = fis.read()) != -1 ){
            System.out.print((char)b);
        }

        fis.close();

    }
}
