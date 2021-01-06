package day04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
        Integer[] integers = new Integer[10];
        for (Integer j :
                list) {
            integers[j] = list.get(j);
        }
        System.out.println(Arrays.toString(integers));
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

}
