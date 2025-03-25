package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\chinese.txt"));

        String str;

        while (( str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();

    }
}
