package com.itheima.FileDemos;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //createNewFile
        //细节1：当前路径如果不存在，则创建成功，方法返回true
        //细节2：如果当前路径表示文件是存在的，则创建失败，方法返回false
        //细节3：createFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        File f1= new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\FileDemos\\b.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);


        //mkdir 创建文件夹//目录
        //细节1：windows当中的路径是唯一的 注意！！！路径一定是唯一的
        //细节2：mkdir 无法创建多级文件夹


        //mkdirs 可以创建多级文件夹，也可以创建单极文件夹 （通常主要用这个）



        //delete
        //细节1：如果删除的是文件，不会进Recyclebin 直接完全delete的了
        //细节2：如果删除的是空文件夹，则直接删除
        //细节3：如果删除的是有内容的文件夹，则删除失败






    }
}
