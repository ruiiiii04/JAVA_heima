package Map;

import java.util.TreeMap;

public class TreeMapPrac1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(4,"辛拉面");
        tm.put(1,"康师傅");
        tm.put(2,"MeeSedap");
        tm.put(3,"Maggi");

        //默认升序
        System.out.println(tm);


        //改成降序
        TreeMap<Integer, String> tm2 = new TreeMap<>((o1, o2) -> o2 - o1);

        tm2.put(4,"辛拉面");
        tm2.put(1,"康师傅");
        tm2.put(2,"MeeSedap");
        tm2.put(3,"Maggi");
        System.out.println(tm2);




    }
}
