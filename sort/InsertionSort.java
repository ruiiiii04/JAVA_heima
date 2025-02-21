package sort;

//插入排序
//先找出无序数组的索引
//然后跟有序的数组比较

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,23,15,354,54,30,99,102};

        int startIndex = -1;
        //先找出无序数组的索引
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        //无序跟有序数组比较
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}
