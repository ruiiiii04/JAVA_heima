package com.itheima.test;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//测试第二个创建事件监听（动作监听）的代码
public class MyJFrame extends JFrame implements ActionListener {
    //按钮创建
    JButton jtb1 = new JButton("点我啊");

    JButton jtb2 = new JButton("在点我啊");
    public MyJFrame(){
        this.setSize(603, 680);
        this.setTitle("动作监听测试2");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);



        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);

        jtb2.setBounds(100,0, 100,50);

        jtb2.addActionListener(this);


        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);



        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //对当前的按钮进行判断


        //获取当前被操作的那个按钮对象
        Object source = e.getSource();

        if(source == jtb1){
            jtb1.setSize(200,200);

        } else if (source == jtb2) {
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500), r.nextInt(500));
            
        }
    }
}
