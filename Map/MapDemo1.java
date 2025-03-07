package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        //put
        //put会添加或者覆盖
        //覆盖还会被覆盖的值
        //正常添加返回null
        String check = m.put("Ali", "Mei");
        m.put("Kentaro", "Rui");
        m.put("Asow", "Wxsdf");

        String str = m.put("Asow", "Axes");

        System.out.println(check);
        System.out.println(str);

        System.out.println(m);



        //remove
        String rm = m.remove("Asow");
        System.out.println(rm);


        //clear
/*        m.clear();
        System.out.println(m);*/



        //containsKey
        boolean flag = m.containsKey("Kentaro");
        System.out.println(flag);




        //containsValue
        flag = m.containsValue("Rui");
        System.out.println(flag);


        boolean empty = m.isEmpty();
        System.out.println(empty);

        int size = m.size();
        System.out.println(size);
    }
}
