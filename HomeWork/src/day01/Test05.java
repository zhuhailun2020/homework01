package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		//先自我生成
		char[] c1 = new char[5];
		//生成并显示
		for (int i = 0; i < 5; i++) {
			c1[i] = (char)((Math.random() >= 0.5) ? (Math.random() * ('z' - 'a' + 1) + 'a') : (Math.random() * ('Z' - 'A' + 1) + 'A'));
			System.out.print(c1[i]);
		}
		System.out.println();
		String s1 = new String(c1).toLowerCase();
		System.out.println("请输入验证码，大小写不限制 : ");
		Scanner console = new Scanner(System.in);
		String s2 = console.nextLine().toLowerCase();
		System.out.println(s1.equals(s2) ? "对了" : "错了");
	}
}

