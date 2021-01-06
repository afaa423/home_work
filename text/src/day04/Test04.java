package day04;

import java.util.ArrayList;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
        list.subList(3,7);
        for (int i = 0; i < list.subList(3,7).size(); i++) {
            list.subList(3,7).set(i,list.subList(3,7).get(i)*10);
        }
        System.out.println(list);
        for (int i = 0; i < 3; i++) {
            list.remove(list.get(list.size()-1));
        }
        System.out.println(list);
    }
}
