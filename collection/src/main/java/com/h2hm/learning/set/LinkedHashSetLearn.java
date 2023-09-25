package com.h2hm.learning.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetLearn {

    public static void linkedHashSetLearn() {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the HashSet
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("D");
        set.add("C");

        // Check if the HashSet contains a specific element
        System.out.println(set.contains("A")); // true

        // Remove an element from the HashSet
        Boolean element = set.remove("A");

        // Print the remaining elements in the HashSet
        for (String s : set) {
            System.out.println(s);
        } // B, C
    }
}
