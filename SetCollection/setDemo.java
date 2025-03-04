package SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        System.out.println(s.add("aaa"));
        System.out.println(s.add("bbb"));
        System.out.println(s.add("aaa"));
        System.out.println(s.add("ccc"));
        System.out.println(s.add("ddd"));

        System.out.println(s);

        
        
        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }


        //增强for
        for (String string : s) {
            System.out.println(string);
        }


        //lambda
        s.forEach(str -> System.out.println(str));







    }
}
