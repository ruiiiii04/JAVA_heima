package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        //底层数据结构依然是哈希表
        //有序的，不重复，无索引
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("c", 345);
        lhm.put("a", 111);
        lhm.put("a", 123);
        lhm.put("b", 234);

        System.out.println(lhm);

    }
}
