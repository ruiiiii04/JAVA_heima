package MethodReference;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo5 {
    public static void main(String[] args) {
        //使用类名调用成员方法（不是Static）
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc");


        //拿着流里面的每一个数据，去调用String类中的toUpperCase方法，方法的返回值是转换之后的结果
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

    }
}
