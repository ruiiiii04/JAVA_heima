package com.itheima.FilePrac;

import java.io.File;

public class Prac4 {
    public static void main(String[] args) {
        //删除一个有文件的文件夹
        //1.先删除文件夹里面的内容
        //2.再删除自己
        File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\ExceptionAndFile\\src\\com\\itheima\\DemoDelete");
        delete(file);



    }

    public static void delete(File src){
        File[] files = src.listFiles();

        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                delete(file);
            }
        }

        src.delete();

    }


}
