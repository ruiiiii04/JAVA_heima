package SetCollection;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan",23);
        Student2 s2= new Student2("lisi",24);
        Student2 s3 = new Student2("wangwu",25);

        TreeSet<Student2> ts = new TreeSet<>();
        ts.add(s2);
        ts.add(s3);
        ts.add(s1);



        System.out.println(ts);


    }
}
