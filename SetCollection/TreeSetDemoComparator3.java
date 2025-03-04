package SetCollection;

import java.util.TreeSet;

public class TreeSetDemoComparator3 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>((o1, o2) ->{
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        );


        //现根据长度进行比较，再来看字母
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);


    }
}
