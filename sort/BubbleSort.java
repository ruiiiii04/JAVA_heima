package sort;

//关键词：相邻的进行比较
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,45,5,10,9,15,789,599};

        getBubbleSort(arr);

        printArr(arr);

    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void getBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
