package ClassicQuestions;

import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        Boyfriend bf1 = new Boyfriend("chua", 24, 178.0);
        Boyfriend bf2 = new Boyfriend("anselm", 20, 183.4);
        Boyfriend bf3 = new Boyfriend("kentaro", 24, 185.4);
        Boyfriend bf4 = new Boyfriend("chris", 24, 178.0);


        Boyfriend[] bfArr = {bf1, bf2, bf3, bf4};

        Arrays.sort(bfArr, (o1, o2) -> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if(temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else{
                    return 0;
                }


        });


        System.out.println(Arrays.toString(bfArr));


    }
}
