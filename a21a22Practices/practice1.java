package com.itheima.a21a22Practices;

import java.util.ArrayList;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        //键盘录入
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean flag = false;

        while(true){
            if(sum > 200){
                flag = true;
                System.out.println("总数超过200了，自动退出。。。");
                break;
            }

            System.out.print("请输入一个整数：");
            String str = sc.nextLine();
            int i = Integer.parseInt(str);

            if(i < 1 || i > 100){
                System.out.println("超过1~100之间的范围，请重新输入！");
                continue;
            }

            //会自动拆箱装箱
            sum = sum + i;
            al.add(i);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }


    }
}
