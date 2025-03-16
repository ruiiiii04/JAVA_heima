package ComprehensivePractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //第一题：的基础上增加概率
        //30 % 抽中女生
        //70 % 抽中男生

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,1,1,1,1,1,1);
        Collections.addAll(list, 0,0,0);

        Collections.shuffle(list);

        Random r = new Random();
        int number = r.nextInt(list.size());

        int bOG = list.get(number);
        System.out.println(bOG);

        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "Ali", "Abu", "May", "Ahmad", "Abap");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "Ashley", "Amber", "Marry", "Apple", "Cherry");

        //表示男生
        if(bOG == 1){
            int boyIndex = r.nextInt(boyList.size());
            System.out.println(boyList.get(boyIndex));
        }
        //表示女孩
        else if(bOG == 0){
            int girlIndex = r.nextInt(girlList.size());
            System.out.println(girlList.get(girlIndex));
        }






    }
}
