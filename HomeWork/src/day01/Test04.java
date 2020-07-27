package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("输入一个email地址");
		Scanner console = new Scanner(System.in);
		String s1 = console.nextLine();
		char[] c1 = s1.toCharArray();
		StringBuilder userName = new StringBuilder();
		for (int i = 0; i < c1.length; i++) {
			if(c1[i] == '@') {
				break;
			}
			userName.append(c1[i]);
		}
		System.out.println("user name : " + userName);
	}
}
