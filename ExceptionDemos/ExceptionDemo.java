package ExceptionDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {

        //编译时期异常(在编译阶段，必须要手动处理，否则代码报错)
        String time = "2020年1月11日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);



        //运行时期异常
//        int[] arr = {1,2,4,5,54,6};
//        System.out.println(arr[10]);


    }
}
