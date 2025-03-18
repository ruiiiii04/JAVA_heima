package MethodReference;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        //引用成员方法
        //格式：对象::成员方法
        //1.其他类格式：其他类对象::方法名
        //2.本类：this::方法名
        //3.父类：super::方法名


        //练习1
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周正若", "赵敏", "张强", "张三丰");
//
//        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
//


        //普通的成员方法，需要用对象来调用的
//        list.stream()
//                .filter(new StringOperation()::stringJudge)
//                .forEach(s -> System.out.println(s));


        //奔本类方法，需要用this来调用的
        //如果是static不能用this，因为static没有this的
        //只能再创建本类的对象用本类的对象调用stringJudge方法
        list.stream().filter(new FunctionDemo3()::stringJudge).forEach(s -> System.out.println(s));



    }

    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;

    }


}
