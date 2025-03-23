package com.itheima.mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\filewritertest.txt", true);

        fw.write(25105);

        fw.write("我勒个骚钢");

        char[] chArr = {'a', 'b', '你', '好', '去', '屎'};

        fw.write(chArr);




        fw.close();



    }
}
