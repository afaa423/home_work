package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        String str = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice";
        String rege = "\\;";
        HashMap<String, Integer> map = new HashMap<>();
        String rege1 = "\\:";
        int pay = 0;
        int money = 0;
        int cx = 0;
        int mg = 0;
        int qd = 0;
        String[] split = str.split(rege);
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(rege1);
            switch (split1[0]){
                case "销售" :
                    pay++;
                    break;
                case "财务" :
                    money++;
                    break;
                case "程序" :
                    cx++;
                    break;
                case "美工" :
                    mg++;
                    break;
                case "前端" :
                    qd++;
                    break;
                default:
                    break;
            }
        }
        map.put("财务",money);
        map.put("销售",pay);
        map.put("程序",cx);
        map.put("美工",mg);
        map.put("前端",qd);
        Set<String> strings = map.keySet();
        for (String ss :
                strings) {
            System.out.println(ss);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> m :
                entries) {
            System.out.println(m);
        }
    }
}
