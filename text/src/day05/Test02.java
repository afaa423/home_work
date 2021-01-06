package day05;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
@Test
    public void mi(){
    Deque<Integer> deque = new LinkedList<>();
    deque.push(1);
    deque.push(2);
    deque.push(3);
    deque.push(4);
    deque.push(5);
    for (Integer i :
            deque) {
        System.out.println(i);
    }
}
}
