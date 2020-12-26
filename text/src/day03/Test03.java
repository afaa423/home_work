package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner console = new Scanner(System.in);
        System.out.println("请输入生日：");
        String str = console.next();
        String rege = "[\\d]{4}-[\\d]{2}-[\\d]{2}";
        if(str.matches(rege)){
            //将输入时间转为date
            Date str1 = simpleDateFormat.parse(str);
            //new一个Date
            Date date = new Date();
            //获取时间差
            long time = date.getTime() - str1.getTime();
            //将毫秒值转化为天
            long day = time/86400000;
            //将天化为星期
            long week = day/7;
            System.out.println("经过了"+week+"个周");
        }else{
            System.out.println("输入错误！！！");
        }
    }
}
