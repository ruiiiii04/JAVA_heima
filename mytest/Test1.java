package com.itheima.mytest;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        //递归
        //1.进入数据源
        //2.遍历数组
        //3.判断文件，拷贝
        //4.判断文件夹，递归


        File src = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src");
        File dest = new File("C:\\Users\\Lenovo\\Downloads\\test\\scr");

        copydir(src, dest);


    }

    public static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //拷贝要从文件开始，也要从文件结束（不是文件夹结束）
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                byte[] bytes = new byte[5 * 1024 * 1024];
                int len;
                while((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0, len);
                }
                fos.close();
                fis.close();
            }else{
                copydir(file, new File(dest, file.getName()));

            }


        }



    }
}
