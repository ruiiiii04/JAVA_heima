package com.itheima.a21a22Practices;

public class practice2 {
    public static void main(String[] args) {
        //算法水题
        //自己实现parseInt方法效果，将字符串形式的数据转成整数
        String str = "123456";
        int result = 0;

        if(!str.matches("[1-9]\\d{0,5}")){
            System.out.println("字符串不符合格式");
        }else{
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                System.out.println(tmp);

                //把字符变成整数
                int num = tmp - '0';
                result = (result * 10) + num;
            }
        }

        System.out.println(result + 1);

    }
}
