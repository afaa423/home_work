package day02;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    private String name;
    private int age;
    private String gender;
    private int salary;
    @Override
    public String toString() {
        return "Test08{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        String name;
        int age;
        String gender;
        int salary;
        Scanner console= new Scanner(System.in);
        System.out.println("输入员工信息：");
        String str = console.next();
        //
        String rege = "\\;";
        String rege1 = "\\,";
        String[][] str2 = new String[2][4];
        String[] person =  str.split(rege);
        for (int i = 0; i < 2; i++) {
            String[] str1 = person[i].split(rege1);
            for (int j = 0; j < 4; j++) {
                str2[i][j] = str1[j];
                System.out.print(str2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
