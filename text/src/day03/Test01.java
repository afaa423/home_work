package day03;

import org.w3c.dom.ls.LSOutput;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Data();
    }
    public static void Data(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  ");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.DATE,3);
        Date time = cale.getTime();
        String s1 = sdf.format(time);
        System.out.println(s1);
    }
}
