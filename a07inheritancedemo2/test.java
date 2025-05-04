package com.itheima.a07inheritancedemo2;

public class test {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();

        h.breakHouse();

        System.out.println("==========");

        TianYuan ty = new TianYuan();
        ty.eat();
        ty.drink();
        ty.eat();


    }
}
