package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//其一实现事件监听的方法（用匿名内部类，或重写接口）
public class MyActionListener extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603,680);
        jFrame.setTitle("测试动作监听");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);


        //创建一个按钮对象
        JButton jtb1 = new JButton("点我");

        //给按钮设置位置和宽高
        jtb1.setBounds(0,0,100,50);

        //给按钮添加动作监听
        //jtb:组件对象，表示你要给那个组件添加事件
        //addActionListener：表示我要给组件添加哪个事件监听（动作监听包含 鼠标左键点击 和 空格）
        //参数：表示时间被触发之后要执行的代码

        //用匿名内部类，因为要重写接口，而且一样的触发不会重复使用
        jtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了");
            }
        });


        jFrame.getContentPane().add(jtb1);




        jFrame.setVisible(true);
    }





}
