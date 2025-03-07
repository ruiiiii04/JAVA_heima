package Map;

import java.util.Objects;

public class Student {
    private String Student;
    private int age;

    public Student() {
    }

    public Student(String student, int age) {
        Student = student;
        this.age = age;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(Student, student.Student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Student, age);
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "Student='" + Student + '\'' +
                ", age=" + age +
                '}';
    }
}
