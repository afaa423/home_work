package day05;

import org.junit.Test;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        String str = console.next();
        Map<String,Integer> map = new HashMap<>();
        String rege = "\\;";
        String rege1 = "\\:";
        String[] split = str.split(rege);
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(rege1);
            map.put(split1[0],Integer.parseInt(split1[1]));
        }
        Integer score = map.get("物理");
        System.out.println(score);
        map.put("化学",96);
        map.remove("英语");
        Set<String> strings = map.keySet();
        for (String ss:
             strings) {
            System.out.println(ss);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> map1 :
                entries) {
            System.out.println(map1);
        }
        Collection<Integer> values = map.values();
        for (Integer i :
                values) {
            System.out.println(i);
        }
    }
}
