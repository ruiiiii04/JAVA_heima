package Lambda;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {2,3,1,5,6,7,8,4,9};

        //这个就是lambda表达式
        //Lambda表达式只能简化函数式接口的匿名内部类的写法   (必须是接口)
        //函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加 @FunctionalInterface注释
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                return o1 - o2;

        });

        System.out.println(Arrays.toString(arr));


        method(() -> {
                System.out.println("在游泳");
            }


        );


    }
    public static void method(Swim s){
        s.swimming();
    }


}

interface Swim{
    public abstract void swimming();
}