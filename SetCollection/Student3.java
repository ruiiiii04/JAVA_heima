package SetCollection;

public class Student3 implements Comparable<Student3>{
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student3() {
    }

    public Student3(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    // 计算总分的方法
    public int getSum() {
        return this.chinese + this.math + this.english;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum= "+ getSum() +
                '}';
    }

    @Override
    public int compareTo(Student3 o) {
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() + o.getMath() + o.getEnglish();

        int i = sum1 - sum2;

        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;


        i = i == 0 ? this.getAge() - o.getAge() : i;

        i = i == 0 ? this.getName().compareTo(o.getName()) : i;



        return i;
    }
}
