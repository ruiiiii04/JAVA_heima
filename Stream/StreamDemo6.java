package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo6 {
    public static void main(String[] args) {
        //终结方法
        //1.foreach


        //2.count
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "Ali", "Abu", "Ama", "Abang");

        long count = list.stream().count();

        System.out.println(count);


        //toArray 方法的参数的作用，负责创建一个指定类型的数组
        //toArray 方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        //toArray 方法的返回值，是一个装着流里面所有数据的数组


        String[] array = list.stream().toArray(new IntFunction<String[]>() {

            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(array));


        String[] array1 = list.stream().toArray((value)->new String[value]);

        System.out.println(Arrays.toString(array1));

    }
}
