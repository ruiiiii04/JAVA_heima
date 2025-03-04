package ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listDemo2 {
    public static void main(String[] args) {
        //list的遍历方式
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }

        System.out.println();

        //2.增强for遍历方式
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();


        //3.lambda (forEach)
        list.forEach( s -> System.out.print(s + " "));


        System.out.println();

        //4.普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


        System.out.println();
        //列表迭代器 (可以在遍历是添加或删除元素)
        ListIterator<String> listIt = list.listIterator();
        while(listIt.hasNext()){
            String str = listIt.next();
            if("bbb".equals(str)){
                listIt.add("qqq");
            }
        }


        System.out.println(list);


    }
}
