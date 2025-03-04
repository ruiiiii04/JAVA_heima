package Generics;

import java.util.ArrayList;

public class practice1 {
    public static void main(String[] args) {

        ArrayList<PersianCat> pc = new ArrayList<>();
        ArrayList<LiHua> lh = new ArrayList<>();

        // 添加 PersianCat 对象
        pc.add(new PersianCat("咪咪", 2));
        pc.add(new PersianCat("小白", 3));

        // 添加 LiHua 对象
        lh.add(new LiHua("大橘", 4));
        lh.add(new LiHua("小花", 1));
        keepPet(pc);

        keepPet(lh);


    }

    //该方法能养所有品种的猫，但是不能狗
    public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }

    }
}
