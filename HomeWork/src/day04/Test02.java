package day04;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> col1=new ArrayList<>();
        col1.add("1");col1.add("$");col1.add("2");col1.add("$");col1.add("3");col1.add("$");col1.add("4");
            Iterator<String> it=col1.iterator();
            while(it.hasNext()){
                if(it.next()=="$"){
                    it.remove();
                }
            }
        Iterator<String> it1=col1.iterator();
            while(it1.hasNext()){
                String s=it1.next();
                System.out.println(s);
            }
    }

}
