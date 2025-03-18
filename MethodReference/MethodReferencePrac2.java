package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodReferencePrac2 {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 24);
        Student stu3 = new Student("王五", 25);
        Student stu4 = new Student("赵六", 26);

        Collections.addAll(stuList, stu1, stu2, stu3, stu4);

        String[] array = stuList.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(array));

    }
}
