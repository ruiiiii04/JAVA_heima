package com.itheima.util;

import java.util.ArrayList;
import java.util.Random;

//工具类
//生成随机验证码
public class CodeUtil {
    public static String getCode(){
        ArrayList<Character> list = new ArrayList<>();//里面要存a-Z

        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        String result = "";

        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(list.size());
            char c = list.get(randomIndex);
            result = result + c;
        }

        int number = r.nextInt(10);
        result = result + number;

        char[] chArr = result.toCharArray();

        int index = r.nextInt(chArr.length);

        char tmp = chArr[4];
        chArr[4] = chArr[index];
        chArr[index] = tmp;

        String code = new String(chArr);

        return code;




    }

    public static void main(String[] args) {
        System.out.println(CodeUtil.getCode());
    }

}
