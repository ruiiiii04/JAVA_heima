package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3(){
        this.setSize(603, 680);
        this.setTitle("键盘监听测试2");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);



        //键盘监听是对整个界面添加的
        this.addKeyListener(this);

        this.setVisible(true);
    }




    //细节1：
    //如果我们按下一个案件没有松开，那么会重复的去调用keyPressed方法
    //细节2：
    //键盘里面那么多按键，如何进行区分？
    //每一个键盘都有一个编号与之区分！！！(跟ascii码值没有关系)

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int keyCode = e.getKeyCode();
        if(keyCode == 65){
            System.out.println("现在按的是A");
        }else if(keyCode == 66){
            System.out.println("现在按的是B");
        }
    }
}
