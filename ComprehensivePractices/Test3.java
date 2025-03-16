package ComprehensivePractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //要求：点到的学生不会再被点到
        //但是如果班级中所有的学生都点完了，需要重新开启第二轮点名
        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list, "坂口健太郎", "木村拓哉", "有村架纯", "小松菜乃", "Jennie", "邓紫棋", "方大同", "Ella");

        Random r = new Random();


        for (int i = 1; i <= 10; i++) {
            System.out.println("===================第" + i + "次点名==========================");
            //这里要注意
            int count = list.size();

            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list.size());
                String str = list.remove(index);
                list2.add(str);
                System.out.println(str);

            }

            list.addAll(list2);

            list2.clear();
        }


    }
}
