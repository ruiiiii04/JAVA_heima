package search;

public class Block {
    private int start;
    private int end;
    private int maxNum;
    private int minNum;


    public Block() {
    }

    public Block(int start, int end, int maxNum, int minNum) {
        this.start = start;
        this.end = end;
        this.maxNum = maxNum;
        this.minNum = minNum;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }
}
