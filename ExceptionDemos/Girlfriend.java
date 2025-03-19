package ExceptionDemos;

public class Girlfriend {
    private String name;
    private int age;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len >10 || len < 3){
            throw new NameFormatException(name + "格式有误，长度应该为3-10");
        }
        this.name = name;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 40){
            throw new AgeOutOfBoundsException(age + "超出了范围");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




}
