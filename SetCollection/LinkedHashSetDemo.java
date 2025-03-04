package SetCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //会记录地址值
        //有序（添加和取出的顺序是一样的）
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("zhangsan", 23);
        Student s4 = new Student("wangwu", 25);

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);


    }
}
