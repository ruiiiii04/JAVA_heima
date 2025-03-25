package com.itheima.mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) throws IOException {
//        //把文章进行恢复到一个新文件当中
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\csb.txt"));
//
//        ArrayList<String> list = new ArrayList<>();
//
//        String line;
//        while((line = br.readLine()) != null){
//            list.add(line);
//        }
//
//        Collections.sort(list, (String o1, String o2)-> {
//                int num1 = Integer.parseInt(o1.split("\\.")[0]);
//                int num2 = Integer.parseInt(o2.split("\\.")[0]);
//
//                return num1 - num2;
//
//            }
//        );
//
//        System.out.println(list);
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\csbcopy.txt"));
//
//        for (int i = 0; i < list.size(); i++) {
//            bw.write(list.get(i));
//            bw.newLine();
//        }
//
//
//        bw.close();
//
//        br.close();


        //更简洁的写法
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\basic-code\\MyIO\\src\\csb.txt"));

        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();

        while ((line = br.readLine()) != null){
            tm.put(Integer.parseInt(line.split("\\.")[0]), line);
        }

        //输出就是entrySet getValue...
        br.close();

        System.out.println(tm);


    }
}
