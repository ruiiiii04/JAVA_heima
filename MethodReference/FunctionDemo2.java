package MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo2 {
    public static void main(String[] args) {

        //引用静态方法
        //格式：类名::静态方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");


        //把他们都变成int类型
        List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collect);


    }
}
