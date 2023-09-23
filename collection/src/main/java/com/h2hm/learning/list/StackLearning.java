package com.h2hm.learning.list;

import java.util.Stack;

public class StackLearning {

    public static void slackLearning() {
        Stack<Integer> stack = new Stack<>();

        // Add elements to the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Remove elements from the Stack
        int element1 = stack.pop();
        int element2 = stack.pop();
        int element3 = stack.pop();

        // Print the removed elements
        System.out.println(element1); // 3
        System.out.println(element2); // 2
        System.out.println(element3); // 1
    }
}
