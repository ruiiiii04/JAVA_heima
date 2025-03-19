package ExceptionDemos;

public class ExceptionDemo2 {
    public static void main(String[] args) {
//        //异常作用1：异常是用来查询bug的关键参考信息
//        Student[] stuArr = new Student[3];
//
//        String name = stuArr[1].getName();
//        System.out.println(name);


        Student stu = new Student("张三-23");

        System.out.println(stu);

    }
}
