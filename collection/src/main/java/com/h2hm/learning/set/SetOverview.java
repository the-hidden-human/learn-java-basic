package com.h2hm.learning.set;


import java.util.HashSet;
import java.util.Set;

public class SetOverview {

    public static void setOverviewLearning() {
        Set<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("A");
        set.add("B");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("E");
        set.add("I");

        // Check if the Set contains a specific element
        System.out.println(set.contains("A")); // true

        // Remove an element from the Set
        // String element = set.remove("A");
        Boolean removeElement = set.remove("A");

        // Print the remaining elements in the Set
        for (String s : set) {
            System.out.println(s);
        } // B
    }
}
