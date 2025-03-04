package SetCollection;


import java.util.TreeSet;

//可排序（默认从小到大）
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(2);
        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(5);

        System.out.println(ts);


        //字符字符串按照ASCII码表中的数字升序进行排序
        //一个字母一个字母一一比较，只要有一个能确定大小关系（更小）就排在前面
        //"aaa" "ab" "aba" "cd" "qwer"


    }
}
