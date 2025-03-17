package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrac3 {
    public static void main(String[] args) {
        ArrayList<String> maleList = new ArrayList<>();
        ArrayList<String> femaleList = new ArrayList<>();

        Collections.addAll(maleList, "张三,23", "李四柒,24", "王五,25", "赵六国,26", "李七俊,27", "王八,28");

        Collections.addAll(femaleList, "美美,23", "杨兔兔,24", "童童,25", "杨晓晓,26", "菲菲,27", "莉莉,28");


        //男演员名字三个字的前两人
        Stream<String> stream1 = maleList.stream()
                .filter(s -> (s.split(",")[0]).length() == 3)
                .limit(2);

        //女演员只要姓杨的,并且不要第一个
        Stream<String> stream2 = femaleList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);


        //过滤后的流，合并一起
        //演员信息封装成actor对象
        //map(类型转换)
        List<Actor> list = Stream.concat(stream1, stream2).map(
                s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))
        ).collect(Collectors.toList());


        System.out.println(list);

    }
}
