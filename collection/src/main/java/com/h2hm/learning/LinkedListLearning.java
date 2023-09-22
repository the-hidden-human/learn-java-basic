package com.h2hm.learning;

import java.util.LinkedList;

public class LinkedListLearning {

    public static void learnLinkedList() {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        // Add elements to the LinkedList
        stringLinkedList.add("John");
        stringLinkedList.add("Mary");
        stringLinkedList.add(null);
        stringLinkedList.add("Mike");
        stringLinkedList.add("Mary");

        // Get the element at index 0
        String name = stringLinkedList.get(0);
        System.out.println(name); // John

        // Replace the element at index 1 with "Peter"
        stringLinkedList.set(1, "Peter");

        // Remove the element at index 2
        stringLinkedList.remove(2);

        // Print the elements in the LinkedList
        for (String n : stringLinkedList) {
            System.out.println(n);
        }
        // Output:
        // John
        // Mary
    }
}
