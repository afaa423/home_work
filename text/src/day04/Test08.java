package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
        new Date();
        ArrayList<Date> dates = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入日期：");
            String s = scanner.next();
            Date time = simp.parse(s);
            dates.add(time);
        }
        Collections.sort(dates);
        System.out.println(dates);

    }

}
