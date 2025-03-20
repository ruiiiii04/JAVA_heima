package com.itheima.FileDemos;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\FileDemos\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println("----------------------------------------------");


        File f2 = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\ExceptionDemos");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());


        System.out.println("----------------------------------------------------");




    }
}
