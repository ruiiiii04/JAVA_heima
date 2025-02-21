package sort;

//从0索引开始更后面的元素一一比较

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 5, 4};
        selectionSort(arr);
        
        getPrintArr(arr);
    }

    private static void getPrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] arr) {

        for (int j = 0; j < arr.length - 1 ; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
}
