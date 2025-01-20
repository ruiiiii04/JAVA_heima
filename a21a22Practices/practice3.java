package com.itheima.a21a22Practices;

public class practice3 {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        int num = 123;
        String str = toBinary(num);

        System.out.println(Integer.toBinaryString(123));
        System.out.println(str);


    }

    private static String toBinary(int num) {
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (num == 0) {
                break;
            }
            int remainder = num % 2;

            sb.insert(0, remainder);

            num = num / 2;


        }
        return sb.toString();

    }

}
