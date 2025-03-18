package MethodReference;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //方法引用
        //1.引用出需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //4.被引用方法的功能需要满足当前的需求
        Integer[] arr = {1,2,3,45,5,6};

        Arrays.sort(arr, FunctionDemo1::subtraction);

        System.out.println(Arrays.toString(arr));


    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

}
