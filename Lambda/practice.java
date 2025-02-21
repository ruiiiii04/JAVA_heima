package Lambda;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        String[] strArr = {"a","aaaa","aa","aaa"};


        Arrays.sort(strArr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(strArr));

    }
}
