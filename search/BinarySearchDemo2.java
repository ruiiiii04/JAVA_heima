package search;

public class BinarySearchDemo2 {
    public static void main(String[] args) {
        //二分查找
        //数组一定要是顺序排序先

        int[] arr = {1,3,4,5,7,10,12,47};

        int result = binarySearch(arr,10);

        System.out.println(result);
    }

    public static int binarySearch(int[] arr,  int key){
        int min = 0;
        int max = arr.length - 1;

        while (true){
            int mid = ( max + min ) / 2;
            if(min > max){
                return -1;
            }
            if(key > arr[mid]){
                min = mid + 1;
            }
            else if (key < arr[mid]){
                max = mid - 1;
            }else{
                return mid;
            }
        }

    }


}
