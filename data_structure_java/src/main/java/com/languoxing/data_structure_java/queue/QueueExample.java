package com.languoxing.data_structure_java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        // 添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.println(queue);
        System.out.println("==========");
        System.out.println("poll=" + queue.poll()); // 返回第一个元素，并在队列中删除
        System.out.println(queue);
        System.out.println("==========");
        System.out.println("element=" + queue.element()); // 返回第一个元素
        System.out.println(queue);
        System.out.println("==========");
        System.out.println("peek=" + queue.peek()); // 返回第一个元素
        System.out.println(queue);

    }
}
