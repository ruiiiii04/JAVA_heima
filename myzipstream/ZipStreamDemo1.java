package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\Resources.zip");
        File dest = new File("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\");

        unzip(src, dest);


    }
    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;

        while((entry = zip.getNextEntry()) != null){
            System.out.println(entry);

            if(entry.isDirectory()) {
                //是文件夹，在目的地创建新的文件夹
                File file = new File(dest, entry.getName());
                file.mkdirs();

            }else {
                //是文件，需要读取到压缩包的文件，并把他存放到目的地dest文件夹中(按层级目录进行存放)
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.getName()));
                int b;

                while ((b = zip.read()) != -1){
                    //写道目的地
                    fos.write(b);

                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();

    }

}
