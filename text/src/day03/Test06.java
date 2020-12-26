package day03;

import java.util.ArrayList;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println("元素个数:"+list.size());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == "four"){
                System.out.println("该集合包含字符串four");
            }else {
                System.out.println("该集合不包含字符串four");
                break;
            }
        }
        if(list.size() == 0){
            System.out.println("该集合有元素");
        }else {
            System.out.println("该集合含有任何元素");
        }
        list.clear();
        System.out.println("该集合的元素个数:"+list.size());
        if(list.size() == 0){
            System.out.println("该集合不含有任何元素");
        }else {
            System.out.println("该集合含有任何元素");
        }

    }
}
