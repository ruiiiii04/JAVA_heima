package com.itheima.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));

        bw.write("你微笑的样子百度都搜索不到");
        bw.newLine();
        bw.write("紫色心情");
        bw.newLine();

        bw.close();



    }
}
