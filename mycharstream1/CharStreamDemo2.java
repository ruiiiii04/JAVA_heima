package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\chinese.txt");

        char[] chArr = new char[2];
        int len;

        //不需要强转了，因为就是空参的read + 强转类型转换
        while ((len = fr.read(chArr)) != -1){
            System.out.print(new String(chArr, 0, len));
        }

        fr.close();

    }
}
