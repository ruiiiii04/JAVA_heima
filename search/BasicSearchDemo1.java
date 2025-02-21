package search;

import java.util.ArrayList;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找//顺序查找
        //课堂练习2：找要的号码，考虑重复问题
        int[] intArr = {2,2,6,8,4,16,2,64,7,2};
        ArrayList<Integer> intAl = basicSearch(intArr, 2);

        for (int i = 0; i < intAl.size(); i++) {
            int n = intAl.get(i);
            System.out.print(n + " ");

        }





    }

    public static ArrayList<Integer> basicSearch(int arr[], int target){
        ArrayList<Integer> intAl = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                intAl.add(i);
            }
        }

        return intAl;

    }
}