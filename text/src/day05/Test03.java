package day05;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03{
    public static void main(String[] args) {
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
        Collection<Emp> emps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入员工信息：");
        String str = scanner.next();
        String rege = "\\;";
        String rege1 = "\\,";
        String[] split = str.split(rege);
        System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            Emp emp = new Emp();
            String[] split1 = split[i].split(rege1);
            System.out.println(Arrays.toString(split1));
            System.out.println(split1.length);
            emp.setName(split1[0]);
            emp.setAge(Integer.parseInt(split1[1]));
            emp.setGender(split1[2]);
            emp.setSalary(Integer.parseInt(split1[3]));
            emps.add(emp);
        }
        System.out.println(emps);

    }

}
