package Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //双列集合
        //不能直接转换成stream要变成单列集合
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("aaa",111);
        hm.put("bbb",111);
        hm.put("ccc",111);
        hm.put("ddd",111);
        hm.put("eee",111);


        Stream<String> stream = hm.keySet().stream();

        stream.forEach(s -> System.out.println(s));


        Stream<Map.Entry<String, Integer>> stream1 = hm.entrySet().stream();

        stream1.forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));


    }
}
