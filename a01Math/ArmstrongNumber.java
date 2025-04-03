package com.itheima.a01Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //水仙花数三位数里面
        //每个位数 power 全位数 能 = 自己的号码
        //查看有多少水仙花数
        int count = getCountArmstrongNumber();

        System.out.println(count);

    }
    public static int getCountArmstrongNumber(){
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);


            if(sum == i){
                System.out.println(i);
                count++;
            }


        }
        return count;

    }
}
