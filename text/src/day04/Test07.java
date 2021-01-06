package day04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int j = (int)(Math.random() * 100);
            integers.add(j);
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}
