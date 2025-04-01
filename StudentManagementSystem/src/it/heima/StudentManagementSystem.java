package it.heima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void StartStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();

        //menu
        loop: while(true) {
            System.out.println("=========================欢迎来到黑马学生管理系统======================");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);

            String choice = sc.next();


            //switch来查看用户选择
            switch (choice) {
                case "1" -> {
                    System.out.println("添加学生");
                    addStudent(list);
                }
                case "2" -> {
                    System.out.println("删除学生");
                    deleteStudent(list);
                }
                case "3" -> {
                    System.out.println("修改学生");
                    editStudent(list);
                }
                case "4" -> {
                    System.out.println("查询学生");
                    checkStudent(list);
                }
                case "5" -> {
                    System.out.println("退出");
                    break loop;

                    //OR 用这个
                    //System.exit(0);
                }
                default -> System.out.println("选择错误，请重新选择！");



            }
        }
    }



    //查看学生唯一性
    public static void addStudent(ArrayList<Student> list){
        Student stu = new Student();

        //用户输入信息
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入学生id");
            String stuId = sc.next();
            stu.setStudentId(stuId);



            boolean flag = containId(list,stuId);
            if(flag){
                System.out.println("Id存在请重新输入");
            }
            else{
                System.out.println("请输入学生姓名");
                String stuName = sc.next();
                System.out.println("请输入学生年龄");
                int stuAge = sc.nextInt();
                System.out.println("请输入学生地址");
                String stuAddress = sc.next();

                stu.setStudentName(stuName);
                stu.setStudentAge(stuAge);
                stu.setStudentAddress(stuAddress);
                break;
            }
        }
        list.add(stu);
        System.out.println("信息输入成功");



    }

    public static void deleteStudent(ArrayList<Student> list){
        //键盘录入要删除的学生id，需要满足一下要求：

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String stuIdDlt = sc.next();

        int subscriptDlt = getSameIdSubscript(list, stuIdDlt);
        if(subscriptDlt >= 0){
            //id存在删除
            list.remove(subscriptDlt);
            System.out.println("删除成功");

        }
        else{
            //id不存在，需要提示不存在，并返回初始菜单
            System.out.println("id不存在，请输入正确学生id");


        }


    }

    public static void editStudent(ArrayList<Student> list){
        System.out.println("请输入要更改的学生id");
        Scanner sc = new Scanner(System.in);
        String stuId = sc.next();

        int subscriptStuId = getSameIdSubscript(list, stuId);

        if(subscriptStuId >= 0){
            //id存在，继续录入其他信息

            Student stu = new Student();
            System.out.println("请输入新的学生id");
            String newStuId = sc.next();

            System.out.println("请输入新的学生姓名");
            String newStuName = sc.next();

            System.out.println("请输入新的学生年龄");
            int newStuAge = sc.nextInt();

            System.out.println("请输入新的学生地址");
            String newStuAddress = sc.next();

            stu.setStudentId(newStuId);
            stu.setStudentName(newStuName);
            stu.setStudentAge(newStuAge);
            stu.setStudentAddress(newStuAddress);

            list.set(subscriptStuId, stu);

        }
        else{
            //id不存在，需要提示不存在，并回到初始菜单
            System.out.println("输入id不存在请重新输入id");

        }

    }

    public static void checkStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前没有学生信息");
            return;
        }

        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getStudentId() + "\t" + stu.getStudentName() +"\t" + stu.getStudentAge() +"\t\t"+ stu.getStudentAddress());
        }


    }

    public static boolean containId(ArrayList<Student> list, String stuId){
        //如果list里面有一样的stuId返回true，没有的话返回false
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            String stuIdCmp = stu.getStudentId();
//
//            if(stuIdCmp.equals(stuId)){
//                return true;
//            }
//        }
//
//        return false;
        return  getSameIdSubscript(list, stuId) != -1;

    }

    public static int getSameIdSubscript(ArrayList<Student> list, String stuId){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String stuIdCmp = stu.getStudentId();

            if(stuIdCmp.equals(stuId)){
                return i;
            }
        }

        return -1;

    }


}
