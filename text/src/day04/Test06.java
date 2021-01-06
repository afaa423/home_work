package day04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String[] strings = new String[]{"one","two","three"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        System.out.println(Arrays.toString(strings));
        System.out.println(list);
    }
}
