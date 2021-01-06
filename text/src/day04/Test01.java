package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Collection<String> list1 = new ArrayList<>();
        Collection<String> list3 = new ArrayList<>();
        list.add("one");
        list3.add("one");
        list.add("two");
        list.add("three");
        list1.add("four");
        list1.add("five");
        list3.add("five");
        list1.add("six");
        list.addAll(list1);
        System.out.println(list.containsAll(list3));
        list.remove("two");
        System.out.println(list);
    }
}




