package ClassicQuestions;

public class question2 {
    public static void main(String[] args) {
        //不死神兔
        //方法1
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i - 2];

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        //方法2：递归
        //1.递归出口
        //2.递归规律
        //Fn(12) = Fn(11) + Fn(10)
        ///....
        int num = getFib(12);

        System.out.println(num);


    }
    public static int getFib(int n){
        if(n == 1 || n == 2){
            return 1;
        }

        return getFib(n-1) + getFib(n-2);


    }



}
