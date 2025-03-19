package ExceptionDemos;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};


        //Throwable 里面的方法printStackTrace()
        //只会打印信息，不会停止运行
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");



        System.err.println(123);
        System.out.println(123);




    }
}
