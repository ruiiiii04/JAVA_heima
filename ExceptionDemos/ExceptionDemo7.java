package ExceptionDemos;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        int[] arr = {};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }

        System.out.println(max);



    }

    //运行时期异常不需要手动声明
    public static int getMax(int[] arr){
        if(arr == null){
            throw new NullPointerException();
        }

        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("看看我执行了吗");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}
