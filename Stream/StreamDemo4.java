package Stream;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //零散的数据

        //通过Stream.of获取Stream流


        Stream.of(1,2,3,4,5).forEach(integer -> System.out.println(integer));


        Stream.of("abc","bcd", "def").forEach(s -> System.out.println(s));


    }
}
