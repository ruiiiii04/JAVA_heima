package Immutable;

import java.util.Iterator;
import java.util.List;

//不可变集合
public class ImmutableDemo1 {
    public static void main(String[] args) {
        //List Set Map 接口可获得

        //一旦创建无法修改，只能查询遍历
        List<String> list = List.of("张三", "Ali", "Abu");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        //增强for
        for (String s : list) {
            System.out.print(s + " ");
        }


        System.out.println();
        System.out.println("-----------------------------------------");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.print(str+ " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------");

        list.forEach((s) -> System.out.print(s + " "));

        list.remove(0);



    }
}
