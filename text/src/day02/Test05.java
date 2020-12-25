package day02;

import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入一个文件名称：");
		String str = console.next();
		int i = str.indexOf('.');
		String str1 = str.substring(i);
		System.out.println(str1);
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		String str2 = time1 + str1;
		System.out.println(str2);
	}

}
