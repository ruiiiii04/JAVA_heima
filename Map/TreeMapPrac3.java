package Map;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapPrac3 {
    public static void main(String[] args) {
        String str = "asbbassabbsabbsbasb";


        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char  c = str.charAt(i);

            if(tm.containsKey(c)){
                int temp = tm.get(c);
                temp++;
                tm.put(c, temp);
            }else{
                tm.put(c, 1);

            }
        }

//        StringBuilder sb = new StringBuilder();
//
//        tm.forEach((character, integer) -> sb.append(character).append(" (").append(integer).append(") "));
//
//        System.out.println(sb);


        StringJoiner sj = new StringJoiner("","","");
        tm.forEach((character, integer) -> sj.add(character + "").add(" (").add(integer + "").add(") "));

        System.out.println(sj);




    }
}
