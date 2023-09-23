package com.h2hm.learning.list;

import java.util.ArrayList;

public class ArrayListLearning {

    public static void learnArrayList() {
        ArrayList<String> learnArrayList = new ArrayList<>();
        // Thêm các phần tử vào ArrayList
        learnArrayList.add("John");
        learnArrayList.add("Mary");
        learnArrayList.add("Mary");
        learnArrayList.add("John");
        learnArrayList.add("Mike");
        learnArrayList.add(null);

        // Lấy phần tử tại vị trí index 0
        String name = learnArrayList.get(0);
        System.out.println(name); // John

        // Thay thế phần tử tại vị trí index 1 bằng "Peter"
        learnArrayList.set(1, "Peter");

        // Xóa phần tử tại vị trí index 2
        learnArrayList.remove(2);

        // In ra các phần tử trong ArrayList
        for (String n : learnArrayList) {
            System.out.println(n);
        }
    }
}
