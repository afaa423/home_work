package day01;

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
        System.out.println("请输入计算表达式：");
        String str = console.next();
        parseInt(str);
        System.out.println();
        //add(str);
    }

    public static void parseInt(String str) {
        // 最后要生成的数字
        int num = 0;
        int num1 = 0;
        // 临时变量，用于计算对应位数的数字
        int y = str.indexOf('+');
        int q = str.indexOf('-');
        int w = str.indexOf('*');
        int e = str.indexOf('/');
        int flag;
        for (int i = 0;i < y || i < q || i < w || i < e; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                flag = (str.charAt(i) - 48);//取出数字
                /*
                 * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
                 * 得到
                 * 可以用Math的相关方法处理(自行查看API文档)
                 */
                for (int n = 0; n < y - 1 - i | n < q - 1 - i | n < w - 1 - i | n < e - 1 - i; n++) {
                    flag *= 10;
                }
                num += flag;

            }
        }
        for (int i = y+1 |q+1|w+1|e+1;i < str.length() ; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                flag = (str.charAt(i) - 48);//取出数字
                /*
                 * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
                 * 得到
                 * 可以用Math的相关方法处理(自行查看API文档)
                 */
                for (int n = 0; n < str.length()- i-1; n++) {
                    flag *= 10;
                }
                num1 += flag;

            }
        }
        int sum ;
        for (int i = 0; i < str.length(); i++) {
            flag = str.charAt(i);
            if(flag == '+'){
                sum = num + num1;
                System.out.println(str+"="+sum);
            }
            if(flag == '-'){
                sum = num - num1;
                System.out.println(str+"="+sum);
            }
            if(flag == '*'){
                sum = num * num1;
                System.out.println(str+"="+sum);
            }
            if(flag == '/'){
                sum = num / num1;
                System.out.println(str+"="+sum);
            }
        }
/*        String str1 = str.substring(0,str.indexOf('+'));
        String str2 = str.substring(str.indexOf('+') + 1);
        System.out.println(str1+"\n"+str2);
        int sum = 0;
        for(int i=0;i<str.length()-str.indexOf('+');i++){
            m*=10;
        }
        sum+=num%m+num/m;*/

    }
}

/*
    public static void add(String str){
        String s = "(\\d*+\\+\\d*+)";
        if(str.matches(s)){
                int n = Integer.parseInt(str.substring(0,str.indexOf('+')));
                int m = Integer.parseInt(str.substring(str.indexOf('+')+1,str.length()));
            System.out.println(n+m);
        }
    }
}
*/








