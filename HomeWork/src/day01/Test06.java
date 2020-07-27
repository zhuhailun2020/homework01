package day01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 *
 * @author Bonnie
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String in = console.next();

		//找到计算符号
		int mMark = -1;    //记录符号的下标
		int inMark = -1;    //记录string里的算术符号下标
		char[] m = {'+', '-', '*', '/'};
		for (int i = 0; i < m.length; i++) {
			if (in.indexOf(m[i]) != -1) {
				mMark = i;
				inMark = in.indexOf(m[i]);
			}
		}

		int front = parseInt(in.substring(0, inMark));
		int behind = parseInt(in.substring(inMark + 1, in.length()));

		switch (mMark) {
			case 0:
				System.out.println((front) + "+" + (behind) + "=" + (front + behind));
				break;
			case 1:
				System.out.println((front) + "-" + (behind) + "=" + (front - behind));
				break;
			case 2:
				System.out.println((front) + "*" + (behind) + "=" + (front * behind));
				break;
			case 3:
				System.out.println((front) + "/" + (behind) + "=" + (front / behind));
				break;
		}


	}

	public static int parseInt(String str) {
		// 最后要生成的数字
		int num = 0;
		// 临时变量，用于计算对应位数的数字
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			flag = (str.charAt(i) - 48);
			for (int n = 0; n < str.length() - 1 - i; n++) {
				flag *= 10;
			}
			num += flag;
		}
		return num;
	}
}








