package com.itheima.FilePrac;

import java.io.File;

public class Prac5 {
    public static void main(String[] args) {
        //作用：统计一个文件夹的总大小(要考虑子文件)
        File f = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima");

        long size = getSize(f);
        System.out.println(size );



    }

    private static long getSize(File scr) {
        File[] files = scr.listFiles();

        long size = 0;

        for (File file : files) {
            if (file.isFile()){
                size = size + file.length();
            }else {
                size = size + getSize(file);
            }
        }

        return size;

    }
}
