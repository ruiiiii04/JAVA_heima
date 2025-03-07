package Map;

import java.util.TreeMap;

public class TreeMapPrac2 {
    public static void main(String[] args) {
        //年龄，名字排序
        TreeMap<Student2, String> tm = new TreeMap<>();

        Student2 s1 = new Student2("zhangsan", 23);
        Student2 s2 = new Student2("lisi", 24);
        Student2 s3 = new Student2("wangwu", 25);
        Student2 s4 = new Student2("ahli", 25);

        tm.put(s1, "江苏");
        tm.put(s2, "北京");
        tm.put(s3, "湖南");
        tm.put(s4, "湖南");

        System.out.println(tm);




    }
}
