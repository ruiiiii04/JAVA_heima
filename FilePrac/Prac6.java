package com.itheima.FilePrac;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prac6 {
    public static void main(String[] args) {
        //需求：统计一个文件夹中每种文件的个数并打印（考虑了文件夹）
        File f = new File("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame");

        HashMap<String, Integer> count = getCount(f);
        Set<Map.Entry<String, Integer>> entries = count.entrySet();

        System.out.println(count);

    }

    public static HashMap<String, Integer> getCount(File f) {
        File[] files = f.listFiles();
        HashMap<String, Integer> hm = new HashMap<>();

        for (File file : files) {
            if (file.isFile()){
                String name = file.getName();
                String[] splitArr = name.split("\\.");
                if(splitArr.length >= 2){
                    String endName = splitArr[splitArr.length - 1];
                    if(hm.containsKey(endName)){
                        //后缀名存在
                        int i = hm.get(endName);
                        i++;
                        hm.put(endName, i);

                    }else {
                        //后缀名不存在
                        hm.put(endName, 1);

                    }

                }

            }else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();

                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(hm.containsKey(key)){
                        //存在
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key, count);
                    }else{
                        hm.put(key,value);
                    }

                }


            }
        }

        return hm;

    }
}
