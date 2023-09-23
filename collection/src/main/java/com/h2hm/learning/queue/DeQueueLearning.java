package com.h2hm.learning.queue;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DeQueueLearning {

    public static void deQueueLearning() {
        // Tạo một deque
        Deque<String> deque = new LinkedList<>();

        // Thêm các phần tử vào deque
        deque.addFirst("A");
        deque.addFirst("B");
        deque.addLast("C");
        deque.addLast("D");
        deque.addLast("E");
        deque.addLast("F");

        // Lấy các phần tử ra khỏi deque
        String element1 = deque.removeFirst();
        String element2 = deque.removeLast();
        String element3 = deque.removeFirst();

        // In các phần tử đã lấy ra
        System.out.println(element1); // B
        System.out.println(element2); // C
        System.out.println(element3); // A
    }
}
