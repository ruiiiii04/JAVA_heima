package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\chinese.txt");

        int ch;

        while((ch = fr.read())!= -1)
        {
            //需要强转因为方法底层会进行解码转成十进制数值
            System.out.print((char)ch);

        }

        fr.close();


    }
}
