package com.h2hm.learning.queue;


import java.util.LinkedList;
import java.util.Queue;

public class QueueLearning {

    public static void queueLearning() {
        Queue<String> queue = new LinkedList<>();
        // Thêm các phần tử vào hàng đợi
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        // Lấy các phần tử ra khỏi hàng đợi
        String element1 = queue.poll();
        String element2 = queue.poll();
        String element3 = queue.poll();

        // In các phần tử đã lấy ra
        System.out.println(element1); // A
        System.out.println(element2); // B
        System.out.println(element3); // C

        System.out.println("Size:" + queue.size());
    }
}
