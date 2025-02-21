package Lambda;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        //lambda省略规则，（参数类型可以省略不写）
        //如果只有一个参数，参数类型可以省略，同时（）也可以省略
        //如果lambda表达式的方法体只有一行，大括号，分号，return 可以省略不写，需要同时省略
        Integer[] arr = {2,4,6,1,6,43,28};

        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));

    }
}
