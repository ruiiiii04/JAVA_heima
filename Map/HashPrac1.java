package Map;

import java.util.HashMap;
import java.util.Set;

public class HashPrac1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("zhangsan", 23);

        HashMap<Student, String> hm = new HashMap<>();

        hm.put(s1, "student1");
        hm.put(s2, "student2");
        hm.put(s3, "student3");

        Set<Student> students = hm.keySet();

        for (Student stuKey : students) {
            System.out.println(stuKey + " = "+ hm.get(stuKey));
        }



    }
}
