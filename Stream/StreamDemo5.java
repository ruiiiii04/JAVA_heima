package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //中间方法
        //Stream流只能使用一次！！！！建议使用链式编程
        //1.filter
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Ali", "Abu", "Beta", "May", "Alex", "Ama");


        //true==当前数据留下
        //false==数据过滤掉
        list.stream().
                filter(s -> s.startsWith("A")).
                forEach(s -> System.out.println(s));


        //Stream不会改变集合原本的数据
        System.out.println(list);





        //2.limit  获取前几个元素
        //3.skip 跳过几个元素
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周正若", "照明", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //第一种思路
        list2.stream().limit(6).skip(3).forEach(s -> System.out.println(s));


        //第二种思路
        list2.stream().skip(3).limit(3).forEach(s -> System.out.println(s));


        System.out.println("------------------------------------------");

        //4.distinct 去重 (依赖hashcode和equals方法)
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "照明","照明","照明", "周正若", "照明", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        list3.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("------------------------------------------");

        //5. concat合并 (尽可能让数据类型保持一致)
        //如果不一样 会类型提升成父类类型，无法使用子类特有功能
        //Stream接口里的静态方法
        Stream.concat(list2.stream(),list3.stream()).forEach(s -> System.out.println(s));


        System.out.println("-----------------------------------------");
        //6.类型转换map
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "周正若-13", "照明-12", "张强-16", "张三丰-25", "张翠山-30", "张良-22", "王二麻子-22", "谢广坤-25");


        list4.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(integer -> System.out.println(integer));

        System.out.println("------------------------------------------");


        list4.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(integer -> System.out.println(integer));






    }
}
