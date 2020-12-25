package day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个数学计算表达式：");
        String str = console.next();
        String rege = "([0-9]\\d*\\.?\\d*\\+[0-9]\\d*\\.?\\d*)|([0-9]\\d*\\.?\\d*\\-[0-9]\\d*\\.?\\d*)|([0-9]\\d*\\.?\\d*\\*[0-9]\\d*\\.?\\d*)|([0-9]\\d*\\.?\\d*\\/[0-9]\\d*\\.?\\d*)";
        String rege1 = "(\\-)|(\\*)|(\\+)|(\\/)";
        if(str.matches(rege)){
            String[] str1 = str.split(rege1);
            double i = Double.parseDouble(str1[0]);
            double j = Double.parseDouble(str1[1]);
            System.out.print(str+"=");
            for (int k = 0; k < str.length(); k++) {
                int flag = str.charAt(k);
                switch(flag){
                    case '+' :
                        System.out.println(i+j);
                        break;
                    case '-' :
                        System.out.println(i-j);
                        break;
                    case '*' :
                        System.out.println(i*j);
                        break;
                    case '/' :
                        System.out.println(i/j);
                        break;
                    default:
                        break;
                }
            }
        }else{
            System.out.println("不是数学计算表达式！");
        }

    }
}
