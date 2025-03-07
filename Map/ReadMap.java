package Map;

import java.util.HashMap;
import java.util.Map;

public class ReadMap {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();

        m.put("坂口健太郎", "睿");
        m.put("邓超", "孙俪");
        m.put("菅田將暉", "小松菜乃");


/*
        //！！！！1.通过键找值
        Set<String> keys = m.keySet();
        System.out.println(keys);

*/
/*
        //遍历单列集合，得到每一个键
        for (String key : keys) {
            String value = m.get(key);
            System.out.println(key +" = "+ value);
        }
*//*



        //练习二：迭代器
        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String str = it.next();
            System.out.println(str +" = "+ m.get(str));
        }


        //练习三：lambda
        keys.forEach(s -> System.out.println(s +" = "+ m.get(s)));

*/



/*
        //！！！！！2.键值对  // 键值对对象    //Entry
        Set<Map.Entry<String, String>> entries = m.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() +" = "+ entry.getValue());
        }


        //迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        //lambda
        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry));

*/




        //！！！！3.lambda 表达式
        Map<String, String> m2 = new HashMap<>();

        m2.put("鲁迅", "lx");
        m2.put("曹操","cc");
        m2.put("李白","lb");
        m2.put("拉拉", "les");


        m2.forEach((key, value) -> System.out.println(key +" = "+ value));




    }
}
