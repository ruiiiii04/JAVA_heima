package sort;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {6,1,24,6,92,45,3,5,445,12,30};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void quickSort(int[] arr, int i, int j){
        int start = i;
        int end = j;

        if(start > end){
            //递归的出口
            return;
        }

        //记录基准数
        int baseNumber = arr[i];


        //利用循环找到要交换的数字
        while(start != end){
            //利用end，从后往前面开始找，找比基准数小的数字
            while(true){
                if(end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
            }

            //利用start,从前往后找，找比基准数大的数字
            while(true){
                if(end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }

            //把end和start只想的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

        //当start和end指向同一个元素的时候，那么上面的循环会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归为
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start]= temp;


        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr,i, start - 1);

        //确定6右边的范围，重复刚刚所作的事情
        quickSort(arr,start + 1, j);
    }
}
