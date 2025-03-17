package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //数组获取stream流
        //用Arrays工具类
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        String[] arr2 = {"ac", "sd", "tys"};

        IntStream stream = Arrays.stream(arr);
        stream.forEach(value -> System.out.println(value));


        Stream<String> stream1 = Arrays.stream(arr2);

        stream1.forEach(s -> System.out.println(s));


    }
}
