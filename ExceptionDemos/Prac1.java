package ExceptionDemos;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Girlfriend gf = new Girlfriend();

        while (true) {
            try {
                System.out.print("输入你心仪的女朋友的名字：");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.print("输入你心仪的女朋友的年龄：");
                String gfAge = sc.nextLine();
                int age = Integer.parseInt(gfAge);
                gf.setAge(age);
                break;
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (NumberFormatException e){
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            } catch(RuntimeException e){
                System.out.println("名字或年龄不符合");
            }
        }

        System.out.println(gf);

    }
}
