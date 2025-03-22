package com.itheima.mybytesstream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //Output写出方法
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\a.txt");

//        fos.write(98);

        byte[] bytes = {97, 98, 99, 100};
//        fos.write(bytes);

        fos.write(bytes, 2, 2);


        fos.close();










    }
}
