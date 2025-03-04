package ListCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合，用迭代器遍历
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        
        //获取迭代器对象
//        Iterator<String> it = coll.iterator();
//
//
//        while (it.hasNext()){
//
//            //next获取元素，并移动指针
//            String next = it.next();
//            System.out.println(next);
//        }


        //细节1：当上面循环结束，如果再使用next会报错(NoSuchElement)
        //没有报索引越界，因为迭代器不依赖索引
//        it.next();


        //细节2；迭代器遍历完毕，指针不会复位
        //要重新遍历的话要创建第二个迭代器
//        System.out.println(it.hasNext());
//        System.out.println(it.hasNext());
//        System.out.println(it.hasNext());



        //细节3！！！！！！！！！！！！！！：迭代器hasNext和next方法是一一对应的
        //如果要反复使用元素，可以创建变量存起来



        //细节4：迭代器遍历时，不能用集合的方法进行增加或者删除（ConcurrentModification。。。。）
        //注意！！：是遍历时不能！！！
        //要用it.remove()
        Iterator<String> it = coll.iterator();


        while (it.hasNext()){

            //next获取元素，并移动指针
            String next = it.next();

            if("bbb".equals(next)){
                it.remove();
            }

        }
        System.out.println(coll);

        
        
    }
}
