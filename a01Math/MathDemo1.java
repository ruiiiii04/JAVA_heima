package com.itheima.a01Math;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs
        //-2147483648 ~ 2147483647
//        System.out.println(Math.abs(88));
//        System.out.println(Math.abs(-88));
//
//        //System.out.println(Math.absExact(-2147483648));


        //ceil
//        System.out.println(Math.ceil(16.4));    //17
//        System.out.println(Math.ceil(16.7));    //17
//
//        System.out.println(Math.ceil(-12.3));    //-12
//        System.out.println(Math.ceil(-12.6));    //-12
//
//
//
//        //floor
//        System.out.println(Math.floor(16.4));    //15
//        System.out.println(Math.floor(16.7));    //15
//
//        System.out.println(Math.floor(-12.3));    //-13
//        System.out.println(Math.floor(-12.6));    //-13



        //round 四舍五入
//        System.out.println(Math.round(16.4));    //16
//        System.out.println(Math.round(16.7));    //17
//
//        System.out.println(Math.round(-12.3));    //-12
//        System.out.println(Math.round(-12.6));    //-13


        //max
        System.out.println(Math.max(20, 30));   //30


        //min
        System.out.println(Math.min(20, 30));   //20




        //pow
        //第二个参数一般传递>=1 的正整数
        System.out.println(Math.pow(2, 3));     //2 power 3  == 8

        System.out.println(Math.pow(2,-2));     //0.25



        //sqrt
        System.out.println(Math.sqrt(4));



        //cbrt
        System.out.println(Math.cbrt(8));










        //random
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random() * 100));
        }


        System.out.println(30/8);
        System.out.println(-30/8);


    }
}
