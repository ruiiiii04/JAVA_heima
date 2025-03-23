package com.itheima.mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        //idea默认用UTF-8
        String str = "ai你哟";
        byte[] strBytes = str.getBytes();

        byte[] strBytes2 = str.getBytes("GBK");

        System.out.println(Arrays.toString(strBytes));

        System.out.println(Arrays.toString(strBytes2));


        System.out.println(new String(strBytes));

        System.out.println(new String(strBytes2, "GBK"));




    }
}
