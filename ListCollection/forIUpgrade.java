package ListCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class forIUpgrade {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        for(String s:coll){
            System.out.print(s + " ");
        }
        System.out.println();


        //forEach
        coll.forEach(new Consumer<String>() {
            @Override
            //s一次表示集合的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });


        //lambda表达式
        coll.forEach(s -> System.out.println(s));


    }
}
