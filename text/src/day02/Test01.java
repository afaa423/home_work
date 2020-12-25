package day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = console.next();
        //判断是否是数字
        String rege = "\\d+";
        //判断是否有小数点
        String rege1 = "([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])";
        boolean i = str.matches(rege);
        boolean l = str.matches(rege1);
        if(l){
            if(i){
                int n = Integer.parseInt(str);
                System.out.println(n*10);
                return;
            }
            double m = Double.parseDouble(str);
            System.out.println(m*5);
        }else {
            System.out.println("不是数字");

        }
    }
}
