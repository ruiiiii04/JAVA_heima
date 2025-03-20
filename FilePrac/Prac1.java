package com.itheima.FilePrac;

import java.io.File;
import java.io.IOException;

public class Prac1 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\FilePrac");

        File scr = new File(f, "a.txt");

        boolean newFile = scr.createNewFile();

        if(newFile){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }


    }
}
