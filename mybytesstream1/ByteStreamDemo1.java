package com.itheima.mybytesstream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream
        //写出一段文字到本地文件中

        //创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\a.txt");

        //写出数据
        fos.write(97);

        //释放资源
        fos.close();










    }
}
