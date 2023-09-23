package com.h2hm.learning.queue;


import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueLearning {

    public static void priorityQueueLearning() {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        // Add elements to the PriorityQueue
//        priorityQueue.add(10);
//        priorityQueue.add(20);
//        priorityQueue.add(25);
//        priorityQueue.add(100);
//        priorityQueue.add(5);
//        priorityQueue.add(15);
//
//        // Remove elements from the PriorityQueue
//        int element1 = priorityQueue.poll();
//        int element2 = priorityQueue.poll();
//        int element3 = priorityQueue.poll();
//
//        // Print the removed elements
//        System.out.println(element1); // 15
//        System.out.println(element2); // 10
//        System.out.println(element3); // 5
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Fu la ai?");
        priorityQueue.add("Cau la ai?");
        priorityQueue.add("Anh la ai?");
        priorityQueue.add("Ban la ai?");
        priorityQueue.add("Di la ai?");
        priorityQueue.add("Em la ai");

        String element1 = priorityQueue.poll();
        String element2 = priorityQueue.poll();
        String element3 = priorityQueue.poll();

        //        // Print the removed elements
        System.out.println(element1); // 15
        System.out.println(element2); // 10
        System.out.println(element3); // 5
    }
}
