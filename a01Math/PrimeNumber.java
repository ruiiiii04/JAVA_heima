package com.itheima.a01Math;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean checkPrimeNo = isPrimeNum(171);
        System.out.println(checkPrimeNo);


    }

    public static boolean isPrimeNum(int num){

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }


        }
        return true;
    }
}
