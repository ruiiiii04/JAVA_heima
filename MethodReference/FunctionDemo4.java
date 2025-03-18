package MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        //引用构造方法
        //是为了创建对象
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌,13", "周正若,14", "赵敏,13", "张强,12", "张三丰,30");

        //封装成Student对象并受到List集合中
        //使用Student类的构造方法创建对象
        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());

        System.out.println(collect);

        


    }

}
