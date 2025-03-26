package com.itheima.myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //将本地文件中的GBK文件，转成UTF-8
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\gbkfile.txt", Charset.forName("UTF-8"));
        FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\gbkcopyfile.txt", Charset.forName("UTF-8"));

        int l;
        while((l = fr.read()) != -1){
            fw.write(l);
        }


        fw.close();
        fr.close();



    }
}
