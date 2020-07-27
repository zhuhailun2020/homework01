package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner console=new Scanner(System.in);
        System.out.println("请输入生产日期");
        String sc=console.nextLine();
        System.out.println("请输入保质期天数");
        int b=console.nextInt();
        Date date=sf.parse(sc);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, b);
        // 到期日往前推两周
        cal.add(Calendar.WEEK_OF_MONTH, -2);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        Date date2=cal.getTime();
        System.out.println("促销日:"+sf.format(date2));
    }
}
