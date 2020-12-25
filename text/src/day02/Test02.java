package day02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "123,456,789,012";
        String rege = ",";
        String[] str1 = str.split(rege);
        for (int i = 0; i < 4; i++) {
            System.out.println(str1[i]);

        }
    }
}
