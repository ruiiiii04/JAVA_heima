package com.itheima.a02staticdemo3Methods2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getOldest(ArrayList<Student> list){

        int oldestAge = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {


            int ageCmp = list.get(i).getAge();

            if(oldestAge < ageCmp){
                oldestAge = ageCmp;
            }


        }

        return oldestAge;

    }


}
