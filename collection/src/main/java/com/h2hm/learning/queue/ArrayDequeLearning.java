package com.h2hm.learning.queue;

import java.util.ArrayDeque;

public class ArrayDequeLearning {

    public static void arrayDequeLearning() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Thêm các phần tử vào ArrayDeque
        arrayDeque.addFirst("A");
        arrayDeque.addFirst("B");
        arrayDeque.addLast("E");
        arrayDeque.addLast("D");
        arrayDeque.addLast("C");

        // Lấy các phần tử ra khỏi ArrayDeque
        String element1 = arrayDeque.removeFirst();
        String element2 = arrayDeque.removeLast();
        String element3 = arrayDeque.removeFirst();

        // In các phần tử đã lấy ra
        System.out.println(element1); // B
        System.out.println(element2); // C
        System.out.println(element3); // A
    }
}
