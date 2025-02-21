package search;

public class InterpolationSearch {
    public static void main(String[] args) {
        //插值查找（进阶版的二分查找）
        //mid = min + key - arr[min] / arr[max] - arr[min] * (max - min)
        int[] arr = {1,3,4,5,7,10,12,47};

        int key = 10;

        int result = interpolationSearch(arr, key);

        System.out.println(result);
    }

    public static int interpolationSearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;

        while (true){
            int mid = min + ((key - arr[min]) / (arr[max - arr[min]])) * (max - min)  ;
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
