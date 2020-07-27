package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Collection<Emp> col=new ArrayList<>();
        Scanner console=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name =console.nextLine();
        System.out.println("请输入年龄");
        int age=console.nextInt();
        System.out.println("请输入性别");
        String gender=console.next();
        System.out.println("请输入工资");
        int salary=console.nextInt();
        System.out.println("请输入入职日期");
        String s=console.next();
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMdd");
        Date hiredate=sf.parse(s);
        Emp s1=new Emp(name,age,gender,salary,hiredate);
        col.add(s1);
        System.out.println(col);





    }

}
