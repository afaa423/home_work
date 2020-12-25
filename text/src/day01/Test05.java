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
		String str = "";
		char str1 = 0;
		for (int i = 0; i < 5; i++) {
			str1 = (char)((Math.random()*122));
			if(str1 >= 'a' && str1 <= 'z' || str1 >= 'A' && str1 <= 'Z'){
				str = str + str1;
			}else{
				i--;
			}
		}
		System.out.println("验证码为：");
		System.out.println(str);
		Scanner console = new Scanner(System.in);
		System.out.println("请输入验证码:");
		String str2 = console.next();
		System.out.println(str2.equalsIgnoreCase(str));

	}
	
}
