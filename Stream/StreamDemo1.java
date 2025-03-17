package Stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b","v");


        //获取流水线
        Stream<String> stream = list.stream();

        //使用终结方法打印
        stream.forEach(s -> System.out.println(s));



    }
}
