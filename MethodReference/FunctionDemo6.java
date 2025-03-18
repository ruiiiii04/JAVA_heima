package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo6 {
    public static void main(String[] args) {
        //方法引用（数组的构造方法）
        //目的：创建一个指定类型的数组
        //细节：数组的类型，需要跟流中数据的类型保持一致

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,34,5);

        Integer[] array = list.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

    }
}
