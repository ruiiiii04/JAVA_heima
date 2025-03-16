package ComprehensivePractices;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        //添加，遍历
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> city1 = new ArrayList<>();
        city1.add("南京市");
        city1.add("扬州市");
        city1.add("无锡市");
        city1.add("常州市");



        ArrayList<String> city2 = new ArrayList<>();
        city2.add("武汉市");
        city2.add("孝感市");
        city2.add("鄂州市");



        ArrayList<String> city3 = new ArrayList<>();
        city3.add("石家庄市");
        city3.add("唐山市");
        city3.add("保定市");

        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);


        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(", ","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key +" = "+ sj);

        }




    }
}
