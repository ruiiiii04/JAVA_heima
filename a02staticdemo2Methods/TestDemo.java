package com.itheima.a02staticdemo2Methods;

public class TestDemo {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String str = ArrayUtil.printArr(intArr);

        System.out.println(str);

        double avg = ArrayUtil.getAverage(intArr);

        System.out.println(avg);

    }
}
