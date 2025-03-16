package Immutable;

import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        //不可变Set集合
        //set元素必须唯一不然不能创建
        Set<String> set = Set.of("张三", "李四", "Ali", "Abu", "May");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------------");


        //一样不能添加删除

        //只能查询




    }
}
