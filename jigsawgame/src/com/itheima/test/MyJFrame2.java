package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//测试鼠标监听
public class MyJFrame2 extends JFrame implements MouseListener {

    JButton jtb = new JButton("点击我啊");

    public MyJFrame2(){
        this.setSize(603, 680);
        this.setTitle("鼠标监听测试2");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        jtb.setBounds(0,0,100,50);
        jtb.addMouseListener(this);

        this.getContentPane().add(jtb);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("点击不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
