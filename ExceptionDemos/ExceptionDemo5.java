package ExceptionDemos;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        //try... catch
        //捕获异常
        //不会报错
        int[] arr = {1,2,3,4,5,6};

        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("Hello World");


        //灵魂1问：如果try中没有遇到问题，怎么执行  ---> 执行try里面的代码，不执行catch的

        //灵魂二问：如果try中遇到多个问题怎么办  ---> 要写各种catch一一对应，异常父类要在最下面


        //灵魂三问：如果try中遇到的问题没有被捕获，怎么执行？  ---> 白写trycatch，虚拟机默认打印异常


        //灵魂四问：如果try中遇到了问题，那么try下面的其他代码还会执行吗  --->不会





    }

}
