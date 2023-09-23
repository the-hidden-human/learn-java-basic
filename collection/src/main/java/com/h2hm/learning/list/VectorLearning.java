package com.h2hm.learning.list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorLearning {

    public static void learnVectorList() {
        Vector<String> learnVector = new Vector<>();
        // Add elements to the Vector
        learnVector.add("John");
        learnVector.add("Mary");
        learnVector.add("Mike");

        // Get the element at index 0
        String name = learnVector.get(0);
        System.out.println(name); // John

        // Replace the element at index 1 with "Peter"
        learnVector.set(1, "Peter");

        // Remove the element at index 2
        // learnVector.remove(2);

        // Print the elements in the Vector
        for (String n : learnVector) {
            System.out.println(n);
        }
    }

}
