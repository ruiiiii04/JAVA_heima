package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //读写多个字节
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\chinese.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\chinesecopy.txt"));

        //读写多个字节
        byte[] bytes = new byte[1024];

        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0 , len);
        }

        bos.close();
        bis.close();

    }
}
