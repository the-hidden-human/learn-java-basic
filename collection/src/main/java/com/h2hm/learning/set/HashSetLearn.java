package com.h2hm.learning.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetLearn {

    public static void hashSetLearn() {
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("A");
        set.add("B");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("E");
        set.add("I");

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
