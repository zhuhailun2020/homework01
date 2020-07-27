package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合否包含c1是集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> col1=new ArrayList<>();
        col1.add("one");
        col1.add("two");
        col1.add("three");
        Collection<String> col2=new ArrayList<>();
        col1.add("four");
        col1.add("five");
        col1.add("six");
        for (String s:col2
             ) {
            col1.add(s);
        }
        Collection<String> col3=new ArrayList<>();
        col3.add("one");
        col3.add("five");
        boolean b=col1.containsAll(col3);
        System.out.println(b);
        col1.remove("two");
        for (String s:col1
        ) {
            System.out.println("集合1："+s);
        }
        for (String s:col2
        ) {
            System.out.println("集合2："+s);
        }
        for (String s:col3
        ) {
            System.out.println("集合3："+s);
        }

    }

}




