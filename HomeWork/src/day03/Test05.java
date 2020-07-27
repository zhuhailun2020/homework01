package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *330328199207153413
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console=new Scanner(System.in);
        String sfz=console.nextLine();
        String s=sfz.substring(6,14);
        //System.out.println(s);
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sf1=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sf.parse(s);
        System.out.println("测得你的生日日期为："+sf1.format(date));
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR,20);
        Date date2=cal.getTime();
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        Date date3=cal.getTime();
        System.out.println("测得你的20岁生日日期为："+sf1.format(date2));
        System.out.println("测得你的20岁生日当周周三的日期为："+sf1.format(date3));
    }
}
