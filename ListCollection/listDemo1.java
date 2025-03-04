package ListCollection;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {
        //list有索引
        //add
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1,"abc");

        System.out.println(list);


        //remove
        //1.删除元素
        //2.删除索引
        //优先调用，。实参和形参类型一样的那个方法
        //remove方法不会自动装箱的
        list.remove(1);
        System.out.println(list);


        //set
        //返回被修改的方法
        String result = list.set(0, "qqq");
        System.out.println(result);
        System.out.println(list);



        //get
        System.out.println(list.get(0));


    }
}
