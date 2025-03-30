package com.itheima.ui;

import com.itheima.domain.User;
import com.itheima.util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {

    static ArrayList<User> allUser = new ArrayList<User>();
    static{
        allUser.add(new User("zhangsan", "123"));
        allUser.add(new User("lisi","1234"));

    }

    JTextField username = new JTextField();

    JPasswordField passwordField = new JPasswordField();

    JTextField code = new JTextField();

    JButton login = new JButton();

    JButton register = new JButton();

    JLabel rightCode = new JLabel();

    public LoginJFrame(){
        initJFrame();

        initView();


        this.setVisible(true);
    }

    private void initView() {
        //添加用户名文字

        JLabel userJLabel = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\用户名.png"));

        userJLabel.setBounds(116,135,51,19);

        this.getContentPane().add(userJLabel);


        //创建用户名的文本输入框
        username.setBounds(195,134,200,30);

        this.getContentPane().add(username);

        //密码文字
        JLabel passwordJLabel = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\密码.png"));

        passwordJLabel.setBounds(130,195,35, 18);

        this.getContentPane().add(passwordJLabel);

        passwordField.setBounds(195,195,200,30);

        this.getContentPane().add(passwordField);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\验证码.png"));
        codeText.setBounds(133,256,50,30);

        this.getContentPane().add(codeText);

        code.setBounds(193,256,100,30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.getCode();

        //设置内容
        rightCode.setText(codeStr);

        rightCode.setBounds(300,256,50,30);

        //绑定鼠标监听
        rightCode.addMouseListener(this);

        this.getContentPane().add(rightCode);


        //登录按钮
        login.setBounds(133,310,128,47);
        login.setIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\登录按钮.png"));

        //去除按钮的边框
        login.setBorderPainted(false);

        //去除按钮的背景
        login.setContentAreaFilled(false);

        login.addMouseListener(this);


        this.getContentPane().add(login);

        //添加注册按钮
        register.setBounds(256,310,128,47);
        register.setIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\注册按钮.png"));

        //去除按钮的边框
        register.setBorderPainted(false);
        //去除按钮的背景
        register.setContentAreaFilled(false);

        register.addMouseListener(this);

        this.getContentPane().add(register);

        JLabel background = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
    }

    private void initJFrame() {
        this.setSize(488, 430);
        this.setTitle("拼图登录界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if(obj == rightCode){
            System.out.println("更换验证码");
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }
        else if(obj == login){
            System.out.println("用户点击了登录");

            //先获取用户输入的用户名，密码，验证码
            String inputUsername = username.getText();
            String inputPassword = passwordField.getText();
            String inputCode = code.getText();

            User u = new User(inputUsername,inputPassword);

            if(inputCode.length() == 0){
                showDialog("验证码不能为空");
            }
            else if(inputPassword.length() == 0 || inputUsername.length() == 0) {

                showDialog("用户名或密码为空");
            }
            else if(!inputCode.equalsIgnoreCase(rightCode.getText())){
                showDialog("验证码填写错误");
            }
            else if(contains(u)){
                //把登录界面弄看不见
                this.setVisible(false);

                new GameJFrame();

            }
            }
        else if(obj == register){
            //代码过后再写
            System.out.println("用户点击了注册");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        //按下登录按钮不松
        if(e.getSource() == login){
            login.setIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\登录按下.png"));
        }
        else if(e.getSource() == register){
            register.setIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\注册按下.png"));

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        //松开登录按钮
        if(e.getSource() == login){
            login.setIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\login\\登录按钮.png"));

        }
        else if(e.getSource() == register){
            register.setIcon(new ImageIcon("image/login/注册按钮.png"));
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void showDialog(String content){
        //创建一个弹框对象
        JDialog jDialog = new JDialog();

        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);

    }

    public boolean contains(User u){
        for (int i = 0; i < allUser.size(); i++) {
            User user = allUser.get(i);
            if(user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())){
                return true;
            }

        }
        return false;
        }



}
