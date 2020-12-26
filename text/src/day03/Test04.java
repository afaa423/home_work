package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入一个生产日期：");
        String str = console.next();
        System.out.println("请输入保质期（天）：");
        int day = console.nextInt();
        String rege = "[\\d]{4}-[\\d]{2}-[\\d]{2}";
        if(str.matches(rege)){
            Date time = simp.parse(str);
            System.out.println(time);
            Date date = new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(time);
            calendar.add(Calendar.DATE,day);
            calendar.add(Calendar.DAY_OF_WEEK,-2);
            calendar.add(Calendar.DATE,3);
            long time1 = calendar.getTimeInMillis();
            String str1 = simp.format(time1);
            System.out.println("促销日是："+str1);
        }else{
            System.out.println("输入错误！！！");
        }
    }
	
}
