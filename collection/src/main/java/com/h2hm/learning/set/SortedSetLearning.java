package com.h2hm.learning.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetLearning {

    public static void sortedSetLearn() {
        // Tạo một SortedSet
        SortedSet<Integer> set = new TreeSet<>();

        // Thêm các phần tử vào SortedSet
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(12);
        set.add(15);
        set.add(28);

        // Kiểm tra xem SortedSet có chứa một phần tử cụ thể hay không
        System.out.println(set.contains(2)); // true

        // Lấy một phần tử ra khỏi SortedSet
        // Integer element = set.remove(2);

        // In các phần tử còn lại trong SortedSet
        for (Integer i : set) {
            System.out.println(i); // 1, 3
        }
    }
}
