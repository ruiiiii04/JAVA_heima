package Generics;

public class LiHua extends Cat{

    public LiHua() {
    }

    public LiHua(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("养狸花猫");
    }
}
