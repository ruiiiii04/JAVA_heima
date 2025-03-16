package Immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {

        //Map细节：
        //键不能重复
        //Map.of是有上限的，最多只能20个参数，10个键值对
        Map<String, String> map = Map.of("Ali", "Indo", "Sultan", "Malaysia", "Zhangsan", "China");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("---------------------------");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " = "+ map.get(key));
        }

        System.out.println("--------------------------");
        map.forEach(( s, s2) -> System.out.println(s + "= "+s2));


        System.out.println("--------------------------");




        //如果键值对参数大于10，要用另一个方法
        //首先需要先创建一个HashMap集合
        HashMap<String,String> hm = new HashMap<>();
//        hm.put("Ali", "Indo");
//        hm.put("Ai", "Indo");
//        hm.put("Al", "Indo");
//        hm.put("li", "Indo");
//        hm.put("ABu", "Indo");
//        hm.put("Abi", "Indo");
//        hm.put("Aci", "Indo");
//        hm.put("Adi", "Indo");
//        hm.put("Aei", "Indo");
//        hm.put("Ati", "Indo");
//        hm.put("Ahi", "Indo");
//        hm.put("Afi", "Indo");
//
//        Set<Map.Entry<String, String>> hmEntry = hm.entrySet();
//        Map.Entry[] array1 = hmEntry.toArray(new Map.Entry[0]);
//
//
//        //不可变的Map集合
//        Map map1 = Map.ofEntries(array1);
//
//        map1.put("AAA", "vvv");


        //最简单的方法

        //如果传递的是可变集合，会返回不可变集合
        //是不可变集合，返回一样的
        Map<String, String> stringStringMap = Map.copyOf(hm);
//        stringStringMap.put("aaa", "sds");


    }
}
