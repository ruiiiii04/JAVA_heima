package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\printwriter.txt"), true);

        pw.write(97);
        pw.println();
        pw.print(97);
        pw.println("你好呀");
        pw.printf("你好呀,%s", "世界");


        pw.close();



    }
}
