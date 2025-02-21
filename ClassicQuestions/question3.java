package ClassicQuestions;

public class question3 {
    public static void main(String[] args) {
        //递归出口：
        //第十天：
        //递归规律：
        //day10 : 1
        //day9 : 1+1 * 2
        //day8 : 4+1 * 2  (后一天数量+1) * 2
        //day7 : 10+1 * 2
        //day6 : 22+2 * 2

        int count = getCount(1);

        System.out.println(count);

    }
    public static int getCount(int day){
        if(day < 1 || day > 10){
            return -1;
        }

        if(day == 10){
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;

    }

}
