package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> lS1 = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        System.out.println(lS1);

        System.out.println(lS1.get(1));

        lS1.set(2, "3");
        System.out.println(lS1);

        lS1.add(1, "2");
        System.out.println(lS1);

        lS1.remove(2);
        System.out.println(lS1);
    }

}
