package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo7 {
    public static void main(String[] args) {
        //收集
        //toList
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "Ali","Avid","Abi","Abud");


        List<String> newList = list.stream()
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());


        System.out.println(newList);





        //toSet
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌-男-15","周正若-女-14","赵敏-女-13","张强-男-20","张三丰-男-100","张翠山-男-40","张良-男-35","王二麻子-男-37","谢广坤-男-41");


        Set<String> collect = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        System.out.println(collect);

        //一样set和list属性
        //list不去重，有序
        //set不去重，无序




        //toMap
        //谁作为键，谁作为值
 /*       Map<String, Integer> collectMap = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                //toMap第一个参数是键的类型。。。
                //第二个参数是值的类型

                //第一个参数流里面数据的类型
                //第二个是map里面键的类型

                //方法apply形参，依次表示流里面的每一个数据
                //方法体：生成键的代码
                //返回值：已经生成的键
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));*/
//
//        System.out.println(collectMap);

        //lambda表达式
        Map<String, Integer> collectMap2 = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])

                ));





        System.out.println(collectMap2);

    }
}
