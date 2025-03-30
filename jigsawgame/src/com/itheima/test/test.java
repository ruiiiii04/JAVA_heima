package com.itheima.test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        //把一维数组打乱并放进二维数组(0-15)

        //定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        //2.打乱数组中的数据顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();

        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


        //3.遍历看有没有成功打乱
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();


        //4.放进二维数组
        int[][] data = new int [4][4];

//        //方法一：
//        int num = 0;
//        for (int i = 0; i < data.length; i++) {
//            for (int i1 = 0; i1 < data[i].length; i1++) {
//                data[i][i1] = tempArr[num];
//                num++;
//            }
//        }



        //方法二：
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }





        //遍历看对不对
        for (int i = 0; i < data.length; i++) {
            for (int i1 = 0; i1 < data[i].length; i1++) {
                System.out.print(data[i][i1] + " ");
            }
            System.out.println();
        }


    }
}
