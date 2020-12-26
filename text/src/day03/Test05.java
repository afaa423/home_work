package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        SimpleDateFormat simp = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat simp1 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        System.out.println("请输身份证号：");
        String id = console.next();
        String rege = "[\\d]{18}|[\\d]{17}[X]";
        if(id.matches(rege)){
            String str = id.substring(6,14);
            Date str1 = simp.parse(str);
            String str2 = simp1.format(str1);
            System.out.println("出生日期:"+str2);
            calendar.setTime(str1);
            calendar.add(Calendar.YEAR,20);
            long time1 = calendar.getTimeInMillis();
            String str3 = simp1.format(time1);
            System.out.println("20岁生日:"+str3);
            calendar.add(Calendar.DAY_OF_WEEK,1);
            calendar.add(Calendar.DATE,-4);
            long time2 = calendar.getTimeInMillis();
            String str4 = simp1.format(time2);
            System.out.println("当周的周三为:"+str4);
        }else{
            System.out.println("格式有误！！！请重新输入！！！");
        }
    }
}
