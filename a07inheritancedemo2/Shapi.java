package com.itheima.a07inheritancedemo2;

public class Shapi extends Dog{

    @Override
    public void eat(){
        //可以直接用super调用父类的方法
        super.eat();
        System.out.println("狗狗啃骨头");
    }
}
