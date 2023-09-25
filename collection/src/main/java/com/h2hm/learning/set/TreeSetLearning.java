package com.h2hm.learning.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetLearning {

    public static void treeSetLearn() {
        TreeSet<Integer> set = new TreeSet<>();

        // Thêm các phần tử vào TreeSet
        set.add(1);
        set.add(3);
        set.add(2);

        set.add(8);
        set.add(12);
        set.add(15);

        set.add(20);
        set.add(21);
        set.add(22);

        // Kiểm tra xem TreeSet có chứa một phần tử cụ thể hay không
        System.out.println(set.contains(2)); // true

        // Lấy một phần tử ra khỏi TreeSet
        // Integer element = set.remove(2);

        // In các phần tử còn lại trong TreeSet
        for (Integer i : set) {
            System.out.println(i); // 1, 3
        }
    }
}
