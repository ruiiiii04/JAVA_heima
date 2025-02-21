package search;

public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        Block b1 = new Block(0,4,40,22);
        Block b2 = new Block(5,8,20,13);
        Block b3 = new Block(9,10,10,7);
        Block b4 = new Block(11,13,48,43);


        Block[] blockArr = {b1,b2,b3,b4};

        int blockSearch = getBlockSearch(arr, blockArr, 7);

        System.out.println(blockSearch);

    }

    private static int getBlockSearch(int[] arr, Block[] blockArr, int key) {

        int indexBlock = findIndexBlock(blockArr, key);

        if(indexBlock == -1){
            return -1;
        }

        for (int i = blockArr[indexBlock].getStart(); i < blockArr[indexBlock].getEnd(); i++) {

            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static int findIndexBlock(Block[] blockArr, int key){
        for (int i = 0; i < blockArr.length; i++) {
            if(key >= blockArr[i].getMinNum() && key <= blockArr[i].getMaxNum()){
                return i;
            }
        }
        return -1;

    }



}
