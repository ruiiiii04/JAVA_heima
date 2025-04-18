package com.itheima.a05inheritancedemo1;

public class test {
    public static void main(String[] args) {
        //1.创建布偶猫的duixiang
        BuOuMao bom = new BuOuMao();
        bom.eat();
        bom.drink();
        bom.catchMouse();

        System.out.println("========================================");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.watchHome();
        h.destroyHome();

        test2 tTwo = new test2();
//        tTwo.testMe();


    }
}
