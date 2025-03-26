package com.itheima.myconvertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //指定字符编码读取数据
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\gbkfile.txt", Charset.forName("GBK"));

        int n;
        while ((n = fr.read()) != -1){
            System.out.print((char)n);
        }

        fr.close();

    }
}
