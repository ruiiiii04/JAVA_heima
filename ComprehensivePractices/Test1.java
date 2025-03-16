package ComprehensivePractices;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        //随机点名
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "Ali", "Abu", "Ahmei", "Apek", "Ahlam", "Sultan");



        Collections.shuffle(list);

        String name = list.get(0);

        System.out.println(name);




    }
}
