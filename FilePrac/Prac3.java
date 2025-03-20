package com.itheima.FilePrac;

import java.io.File;

public class Prac3 {
    public static void main(String[] args) {
        //找到电中所有avi的文件
        File src = new File("C:\\");

        findAVI(src);



    }
    public static void findAVI(File src){
        //进入文件夹src
        File[] files = src.listFiles();

        if(files != null) {

            //遍历数组，依次得到src里面每一个文件或者文件夹
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    findAVI(file);
                }
            }
        }

    }


}
