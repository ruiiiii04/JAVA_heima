package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {


    //4.放进二维数组
    int[][] data = new int[4][4];
    int x = 0;
    int y = 0;

    //定义一个变量，记录当前展示图片的路径
    String path = "..\\jigsawgame\\image\\animal\\animal2\\";


    //定义一个二维数组，存储正确的数据
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //计数器变量
    int step = 0;



    //动作监听能使用
    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem ladyItem = new JMenuItem("美女");

    JMenuItem animalItem = new JMenuItem("动物");

    JMenuItem sportItem = new JMenuItem("运动");

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        initData();


        //初始化图片
        initImage();

        //让界面显示出来
        this.setVisible(true);
    }

    private void initData() {


        //把一维数组打乱并放进二维数组(0-15)

        //定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        //2.打乱数组中的数据顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();

        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


//        //方法一：
//        int num = 0;
//        for (int i = 0; i < data.length; i++) {
//            for (int i1 = 0; i1 < data[i].length; i1++) {
//                data[i][i1] = tempArr[num];
//                num++;
//            }
//        }


        //方法二：


        for (int i = 0; i < tempArr.length; i++) {

            //记录空白方块在二维数组的位置
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
                data[i / 4][i % 4] = tempArr[i];

        }


    }

    private void initImage() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if(victory()){
            JLabel winJLabel = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\win.png"));
            winJLabel.setBounds(203,293,197,73);
            this.getContentPane().add(winJLabel);
        }


        //计数器功能
        JLabel stepJLabel = new JLabel("步数: " + step);
        stepJLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepJLabel);



        //创建一个图片ImageIcon的对象
        //创建一个JLabel的对象（管理容器）


        //先看内循环干什么，再看外循环
        //内循环：一行添加四张图片
        //外循环：循环四次行

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));

                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //给图片增加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                //把管理容器添加到界面当中
                this.getContentPane().add(jLabel);

            }

        }

        //细节：
        //先加载的图片在上方，后加载的图片赛在下面

        //背景图片
        JLabel background = new JLabel(new ImageIcon("..\\jigsawgame\\image\\background.png"));

        background.setBounds(40, 40, 508, 560);

        //把背景图片添加到界面中
        this.getContentPane().add(background);


        this.getContentPane().repaint();


    }

    private void initJMenuBar() {

        //创建整个菜单的对象
        JMenuBar jMenuBar = new JMenuBar();


        //创建菜单上面的两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenu changePicJMenu = new JMenu("更换图片");






        //把条目对象添加到对应的JMenu
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        changePicJMenu.add(ladyItem);
        changePicJMenu.add(animalItem);
        changePicJMenu.add(sportItem);

        functionJMenu.add(changePicJMenu);


        //再把JMenu添加到JMenuBar
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);




        //添加动作监听
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);

        accountItem.addActionListener(this);


        ladyItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);



        //给整个栏目设置菜单
        this.setJMenuBar(jMenuBar);


    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //取消默认的居中放置，只有取消了才会照XY轴的形式添加组件
        this.setLayout(null);

        //添加键盘监听
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松是会调用这个代码
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            JLabel background = new JLabel(new ImageIcon("..\\jigsawgame\\image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();

        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此时方法需要直接结束，不能再执行下面的移动代码了
        if(victory()){
            //结束方法
            return;
        }


        //对上下左右进行判断
        //左37 右 39 上38 下40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");

            if (y == 3) {

                return;
            }

            //把空白的右边图片和空白进行交换
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;

            //每移动一次计数器自增
            step++;

            initImage();

        } else if (code == 38) {

            if (x == 3) {
                //表示空白方块已经在最下方了，他的下面没有图片再能移动了
                return;
            }

            System.out.println("向上移动");

            //把空白的下方图片和空白换位
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;

            //每移动一次计数器自增
            step++;

            //调用方法加载图片
            initImage();


        } else if (code == 39) {

            if (y == 0) {

                return;
            }

            System.out.println("向右移动");

            //把空白的左边图片和空白进行交换
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;

            //每移动一次计数器自增
            step++;


            initImage();
        } else if (code == 40) {
            if (x == 0) {

                return;
            }
            System.out.println("向下移动");

            //把空白的上图片和空白换位
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;

            //每移动一次计数器自增
            step++;


            initImage();
        }else if(code == 65){
            initImage();
        }
        //作弊码按w，一键通关
        else if(code == 87){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }


    }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] != win[i][j]){
                    return false;
                }

            }
        }
        return true;
    }


    //动作监听用来操控栏目功能
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");

            //计数器
            step = 0;

            //打乱图片
            initData();

            //加载图片
            initImage();

        }
        else if(obj == reLoginItem){
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();

        }
        else if(obj == closeItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }
        else if(obj == accountItem){
            System.out.println("公众号");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\jigsawgame\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);

            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
        else if(obj == ladyItem){
            //13张
            Random r = new Random();
            int num = r.nextInt(13) + 1;
            path = "..\\jigsawgame\\image\\girl\\girl" + num + "\\" ;
            initImage();

            //修改path变量记录的值

        }
        else if(obj == animalItem){
            //8张
            Random r = new Random();
            int num = r.nextInt(8) + 1;
            path = "..\\jigsawgame\\image\\animal\\animal" + num + "\\" ;
            initImage();

        }
        else if(obj == sportItem){
            //10张
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            path = "..\\jigsawgame\\image\\sport\\sport" + num + "\\" ;
            initImage();
        }
    }
}
