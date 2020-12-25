package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "大家好！";
		String str1 = "我是程序员！";
		String str2 = "是优秀的";
		String str3 = "是牛牛的";
		String str4 = str.concat(str1);
		System.out.println(str4);
		String str5 = str4.replaceFirst("是",str2);
		System.out.println(str5);
		String str6 = str5.replaceAll(str2,str3);
		System.out.println(str6);
		String str7 = str6.substring(str.length());
		System.out.println(str7);

	}
}
