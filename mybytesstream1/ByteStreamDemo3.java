package com.itheima.mybytesstream1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\a.txt", true);

        String str = "kankelaoyezuishuai";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        fos.write(bytes1);

        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);

        String str2 = "666";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);


        fos.close();


    }
}
