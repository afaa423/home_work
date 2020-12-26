package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Emp emp = new Emp();
        ArrayList<Emp> emps = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工数量：");
        int sum = console.nextInt();
        String[][] str = new String[sum][5];
        String rege = "\\,";
        for (int i = 0; i < sum; i++) {
            System.out.println("请输入员工信息：");
            String str1 = console.next();
            String[] str2 = str1.split(rege);
            for (int j = 0; j < 5; j++) {
                str[i][j] = str2[j];
            }
        }
        emp.setName(str[0][0]);
        emp.setAge(Integer.parseInt(str[0][1]));
        emp.setGender(str[0][2]);
        emp.setSalary(Integer.parseInt(str[0][3]));
        emp.setHiredate(str[0][4]);
        emps.add(emp);
        for (int i = 1; i < sum; i++) {
           emp.setName(str[i][0]);
           emp.setAge(Integer.parseInt(str[i][1]));
           emp.setGender(str[i][2]);
           emp.setSalary(Integer.parseInt(str[i][3]));
           emp.setHiredate(str[i][4]);
           if(emps.equals(emp.getName())) {
               System.out.println("有相同的人了");
               break;
           }else{
               emps.add(emp);
           }
        }
        System.out.println(emps);
    }
}
