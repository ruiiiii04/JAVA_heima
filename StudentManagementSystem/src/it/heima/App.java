package it.heima;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
            String choice = sc.next();
            switch (choice) {
                case "1" -> {
                    login(list);
                }
                case "2" -> {
                    register(list);
                }
                case "3" -> {
                    forgotPassword(list);
                }
                case "4" -> {
                    System.out.println("退出");
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> {
                    System.out.println("没有这个选择请重新选择");
                }
            }
        }

    }

    private static void forgotPassword(ArrayList<User> list) {
        System.out.println("进入忘记密码");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        boolean containNameFlag = containUserName(list, userName);
        if(!containNameFlag){
            System.out.println("用户名还未注册");
            return;
        }
        System.out.println("请输入身份证号码");
        String userId = sc.next();
        System.out.println("请输入手机号码");
        String userPhone = sc.next();

        int index = getSubscript(list, userName);

        User u = list.get(index);

        if(!(u.getPersonId().equals(userId) && u.getPhoneNumber().equals(userPhone))){
            System.out.println("身份证号码或手机号码输入有误，不能修改密码");
            return;
        }

        String password = "";
        while (true) {

            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("请再次输入新的密码");
            String againPassword = sc.next();

            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {

                System.out.println("密码不一致，请重新输入");
                continue;
            }
        }

        //直接修改密码即可
        u.setPassword(password);



    }



    //用户名长度必须在3-15之间
    //只能是字母加数字的组合，但是不能是纯数字
    private static boolean checkUserName(String userName) {
        //提高效率
        int lenUserName = userName.length();
        //用户名长度必须在3-15之间
        if(lenUserName < 3 || lenUserName > 15){
            System.out.println("用户名不满足长度条件(3-15之间)");
            return false;
        }

        //只能是字母加数字的组合，但是不能是纯数字
        //先验证是否都是字母//数字
        for (int i = 0; i < userName.length(); i++) {
            char checkChar = userName.charAt(i);
            if(!((checkChar >= '0' && checkChar <= '9') || (checkChar >= 'a' && checkChar <= 'z') || (checkChar >= 'A' && checkChar <='Z'))){
                System.out.println("用户名只能是字母或数字组成");
                return false;
            }

        }

        //查看userName是否为纯数字（看有没有至少一个字母）
        //1abcd
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            char checkChar = userName.charAt(i);
            if((checkChar >= 'a' && checkChar <= 'z') || (checkChar >= 'A' && checkChar <= 'Z')){
                count++;
                break;
            }

        }

        return count > 0;

    }

    private static void register(ArrayList<User> list) {
        System.out.println("进入注册账号");

        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);

        String userName = "";
        while (true) {
            userName = sc.next();
            //先验证格式是否正确，再验证是否唯一
            //因为在以后所有的数据，都哦是存在啊数据库中的，如果我们要校验，需要使用到网络资源
            //！！！！（避免浪费不必要的性能）

            //用户名长度必须在3-15之间
            //只能是字母加数字的组合，但是不能是纯数字
            boolean flag1 = checkUserName(userName);

            if(!flag1){
                System.out.println("用户名格式错误，需要重新输入(用户名不能都是数字)");
                continue;
            }

            //校验用户名字唯一性
            //userName到集合判断是否唯一
            boolean flag2 = containUserName(list, userName);

            if(flag2){
                //用户名存在，无法注册，用户名需要重新输入
                System.out.println("用户名已存在，请重新输入");
                continue;
            }
            else{
                //用户名不存在
                System.out.println("用户名" + userName + "可用");
                break;
            }

        }


        String password = "";
        //注册密码
        while(true) {
            System.out.println("请输入注册密码");
            password = sc.next();

            System.out.println("请再次输入密码");
            String passwordAgain = sc.next();

            if (password.equals(passwordAgain)) {
                System.out.println("密码注册成功");
                break;
            } else {
                System.out.println("密码注册失败，请重新输入密码");
            }
        }


        String userId = "";
        //验证身份证号码 n
        while(true){
            System.out.println("请输入身份证号码");
            userId = sc.next();

            boolean flagId = checkUserId(userId);
            if(flagId){
                System.out.println("身份证id满足要求");
                break;
            }
            else{
                System.out.println("身份证id格式错误，请重新输入");
                continue;
            }



        }

        String phoneNum = "";
        //键盘录入手机号码
        while(true){
            System.out.println("请输入手机号码");
            phoneNum = sc.next();

            boolean flagPhoneNum = checkPhoneNum(phoneNum);

            if(flagPhoneNum){
                System.out.println("成功输入用户电话号码");
                break;
            }else{
                System.out.println("用户电话号码格式错误，请重新输入");
                continue;
            }
        }

        User u = new User(userName, password, userId, phoneNum);
        list.add(u);
        System.out.println("注册成功");

        
        //遍历集合查看
        printList(list);



    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getUserName() +", " + u.getPassword()+", "+ u.getPersonId()+", "+ u.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNum(String phoneNum) {
        //长度为11
        if(phoneNum.length() != 11){
            System.out.println("错误，手机号码只能有11个数字");
            return false;
        }

        //不能以0为开头
        if(phoneNum.startsWith("0")){
            System.out.println("电话号码不能以0为开头，请重新输入");
            return false;
        }

        //必须都是数字
        char[] phoneNumArr = phoneNum.toCharArray();
        for (int i = 0; i < phoneNum.length(); i++) {
            char checkChar = phoneNumArr[i];
            if(!(checkChar >= '0' && checkChar <= '9')){
                System.out.println("错误电话号码，只能都是数字");
                return false;
            }
        }

        return true;


    }

    private static boolean checkUserId(String userId) {
        //身份证id长度只能为18
        if(userId.length() != 18){
            System.out.println("错误id，身份证id长度只能为18");
            return false;
        }

        //不能以0开头
        if(userId.startsWith("0")){
            System.out.println("身份证Id不能以0开头，请重新如数用户Id");
            return false;
        }

        //前17位必须是数字
        for (int i = 0; i < 17; i++) {
            char checkChar = userId.charAt(i);

            if(!(checkChar >= '0' && checkChar <= '9')){
                System.out.println("身份证id错误前17位必须是数字");
                return false;
            }
        }

        //id最后一位可以数数字，也可以是大写X或小写x
        int lastIdDigit = userId.charAt(userId.length()-1);
        if(!((lastIdDigit >= '0' && lastIdDigit <= '9') || (lastIdDigit == 'X') || (lastIdDigit == 'x'))){
            System.out.println("身份证id最后一位只能是正数或者X/x");
            return false;
        }

        return true;

    }

    private static boolean containUserName(ArrayList<User> list, String userName) {
//        for (int i = 0; i < list.size(); i++) {
//            User user = list.get(i);
//            String cmpUserName = user.getUserName();
//            if(cmpUserName.equals(userName)){
//                return true;
//            }
//
//        }
//        return false;
        int flag = getSubscript(list, userName);
        return flag >= 0;
    }

    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {


            //查看密码是否一样
            //集合中是否包含用户名和密码
            //定义一个方法验证用户名和密码是否正确
//        User u = list.get(index);
//
//        System.out.println("请输入用户密码");
//        String  userInpPassword = sc.next();
//        String userPassword = u.getPassword();
//
//        if(userInpPassword.equals(userPassword)){
//            System.out.println("登陆成功");
//        }
//        else{
//            System.out.println("登陆失败");
//        }
            System.out.println("进入登入账号");

            System.out.println("请输入用户名");
            String userName = sc.next();

            //查看用户名有没有在注册的list中，有的话获取索引
            int index = getSubscript(list ,userName);
            if(index < 0){
                System.out.println("改用户并未注册账号，请先注册才可登录");
                return;
            }

            System.out.println("请输入用户密码");
            String  userInpPassword = sc.next();

            //验证code
            while(true) {
                System.out.println("用户存在，请输入正确如下的验证码");
                String code = getCode();
                System.out.println(code);

                String userInpCode = sc.next();

                if (code.equalsIgnoreCase(userInpCode)) {
                    System.out.println("验证成功");
                    break;
                }
                else{
                    System.out.println("验证失败，请重新验证");
                    continue;

                }
            }
            //我们可以把一些零散的数据，封装成一个对象
            User useInfo = new User(userName, userInpPassword, null, null);

            boolean result = checkUserInfo(useInfo, list);

            if(result){
                System.out.println("登录成功，可以开始使用学生管理系统了");
                //创建对象，调用方法，启动学生系统
                StudentManagementSystem sm = new StudentManagementSystem();
                sm.StartStudentSystem();
            }
            else{
                System.out.println("登录失败，用户名或密码错误");
                if(i==2){
                    System.out.println("当前账号" +userName+ "被锁定，请联系黑马程序员客服");
                    return;
                }
                else{
                    System.out.println("用户名或密码错误，还剩下"+ (2-i) + "此次机会");
                }

            }
        }






        
    }

    private static boolean checkUserInfo(User useInfo, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getUserName().equals(useInfo.getUserName()) && user.getPassword().equals(useInfo.getPassword())){
                return true;
            }

        }
        return false;
    }

    //生成验证码
    private static String getCode() {
        ArrayList<Character> alphabetList = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            alphabetList.add((char)('a' + i));
            alphabetList.add((char)('A' + i));
        }

        Random r = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int alphabetIndex = r.nextInt(alphabetList.size());
            char c = alphabetList.get(alphabetIndex);
            sb.append(c);
        }

        int randomIndex = r.nextInt(10);
        sb.append(randomIndex);

        String code = sb.toString();

        char[] codeCharArr = code.toCharArray();
        for (int i = 0; i < codeCharArr.length; i++) {
            int index = r.nextInt(codeCharArr.length);

            char tmp = codeCharArr[i];
            codeCharArr[i] = codeCharArr[index];
            codeCharArr[index] = tmp;
        }

        String finalCode = new String(codeCharArr);
        return finalCode;
    }

    private static int getSubscript(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String cmpUserName = u.getUserName();

            if(cmpUserName.equals(userName)){
                return i;
            }

        }
        return -1;
    }
}
