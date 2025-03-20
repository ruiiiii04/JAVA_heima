package com.itheima.FileDemos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {
    public static void main(String[] args) {

        //1.length方法
        //细节：只能获取文件的大小 单位是字节
        //不能获得文件夹的大小
        File f1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\FileDemos\\a.txt");
        long len = f1.length();
        System.out.println(len);


        //如果要获取文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起
        File f2 = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\FileDemos");
        len = f2.length();
        System.out.println(len);

        System.out.println("==============================================");
        File f3 = new File("a.txt");
        System.out.println(f3.getAbsolutePath());



        //getPath file里面创建的是什么返回的就是什么
        System.out.println("==============================================");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());



        //getName
        System.out.println("==============================================");
        //细节：如果是文件 有后缀名
        //      如果只是问价夹   只有文件夹的名字



        //lastModified
        //返回的是毫秒值
        System.out.println("==============================================");
        long l = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = new Date(l);
        String formattedDate = sdf.format(d);
        System.out.println(formattedDate);






    }
}
