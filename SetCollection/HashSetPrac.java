package SetCollection;

import java.util.HashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("zhangsan", 23);
        Student s4 = new Student("wangwu", 25);



        //创建去重的学生集合
        //自定义的要重写hashCode和equals方法
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);


    }
}
