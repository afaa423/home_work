package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个IP地址：");
        String str = console.next();
        String rege = "\\.";
        String[] str1 = str.split(rege);
        for (int i = 0; i < 4; i++) {
            System.out.println(str1[i]);
        }
    }

}
