package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //字节打印流
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\printstream.txt"), true, Charset.forName("UTF-8"));

        ps.write(97);

        ps.println();
        ps.println("安镇爱上了阿强");
        ps.print("你妈妈有吗");
        ps.println();
        ps.printf("你好%s", "World");

        ps.close();

    }
}
