package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console=new Scanner(System.in);
        String str=console.nextLine();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
        Date date= sf1.parse(str);
        System.out.println("生日日期："+sf.format(date));
        Date date1 = new Date();
        long time=date1.getTime()-date.getTime();
        System.out.println("经历了多少周："+time/1000/60/60/24/7);

    }

}
