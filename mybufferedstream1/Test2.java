package com.itheima.mybufferedstream1;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //实现一个验证程序运行次数的小程序
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\count.txt"));

        String line = br.readLine();

        br.close();

        int num = Integer.parseInt(line);



        if(num <= 3){
            System.out.println("第"+ num +"次使用");
            num++;
        }else {
            System.out.println("没有机会了");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\count.txt"));
        bw.write(num + "");


        bw.close();



    }
}
