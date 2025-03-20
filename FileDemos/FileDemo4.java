package com.itheima.FileDemos;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        //listFiles  (需要掌握)
        File f = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\FileDemos");
//        File[] files = f.listFiles();
//
//        for (File file : files) {
//            System.out.println(file);
//        }
//
//        //listRoots
//        File[] files1 = File.listRoots();
//
//        for (File file : files1) {
//            System.out.println(file);
//        }


        //只要后缀是.txt的文件
        File[] files2 = f.listFiles();

        for (File file : files2) {
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }


    }
}
