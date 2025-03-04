package SetCollection;

import java.util.TreeSet;

public class TreeSetPrac1 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("zhangsan", 23,90, 99,50);
        Student3 s2 = new Student3("lisi", 24,90, 98,50);
        Student3 s3 = new Student3("wangwu", 25,95, 100,30);
        Student3 s4 = new Student3("zhaoliu", 26,60, 99,70);
        Student3 s5 = new Student3("qianqi", 27,70, 80,70);


        TreeSet<Student3> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student3 t : ts) {
            System.out.println(t);
        }


    }
}
