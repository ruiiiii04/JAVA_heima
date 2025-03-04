package ListCollection;

import java.util.ArrayList;
import java.util.Collection;

public class collDemo1 {
    public static void main(String[] args) {

        //1.Collection (单列集合)
        //a.list有序（存和取的顺序是一样的）
        //可重复
        //有索引


        //b.set无序
        //不可重复
        //无索引


        //Collection 是单列集合的祖宗接口，他的功能是全部单列集合都可以继承使用的
        //Collection是一个接口，不能直接创建他的对象
        //实现类：ArrayList LinkedList
        //1. public boolean add(E e)
        Collection<String> coll = new ArrayList<>();

        //往List集合添加数据，那么方法永远返回true，因为List是允许元素重复的
        //Set的话如果当前添加的元素已经存在返回false
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清空
//        coll.clear();
//        System.out.println(coll);


        //3.删除
        //删除成功返回true；失败false（删除元素不存在）
        coll.remove("aaa");
        System.out.println(coll);


        //4.contains （元素是否包含）
        //细节：底层是依赖equals方法进行判断是否存在
        //所以，如果集合中存在的是自定义对象，也想通过contains方法来判断是否包含，那么javabean类中，一定要写equals方法
        System.out.println(coll.contains("aaa"));
        System.out.println(coll.contains("bbb"));

        Collection<Student> coll2 = new ArrayList<>();
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("zhangsan", 23);

        coll2.add(stu1);
        coll2.add(stu2);
        coll2.add(stu3);

        System.out.println(coll2.contains(stu3));


        //5.isEmpty
        boolean empty = coll.isEmpty();

        System.out.println(empty);

    }
}
