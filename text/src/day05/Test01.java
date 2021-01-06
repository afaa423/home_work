package day05;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    @Test
    public void m(){
        Deque<Integer> integers = new LinkedList<>();
        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addFirst(4);
        integers.addFirst(5);
        for (Integer i :
                integers) {
            System.out.println(i);
        }

    }
}
