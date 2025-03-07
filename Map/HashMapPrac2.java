package Map;

import java.util.*;

public class HashMapPrac2 {
    public static void main(String[] args) {

        String[] strArr = {"A", "B", "C", "D"};

        Random r = new Random();

        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            al.add(strArr[index]);
        }


        //如果统计的东西比较多，不方便使用计数器思想
        HashMap<String, Integer> hm = new HashMap<>();

        for (String name : al) {
            if(hm.containsKey(name)){
                //存在
                int temp = hm.get(name);
                temp++;
                hm.put(name, temp);



            }else{
                //不存在   //添加并加1
                hm.put(name, 1);

            }

        }


        System.out.println(hm);


        //求最大值 (要考虑没有人投票和一样票数)
        int max = 0;

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int val = entry.getValue();
            if(val > max){
                max = val;
            }
        }

        System.out.println(max);


        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if(max == count){
                System.out.println(entry.getKey());
            }
        }






    }
}
