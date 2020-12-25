package day01;

import java.util.Arrays;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {

		String str = "123456789@163.com";
		String str1 = "@163.com";


		System.out.println(Arrays.toString(str.split(str1)));
	}
}
