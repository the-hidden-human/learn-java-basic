package com.h2hm.learning.map;

import java.util.HashMap;

public class HashMapLearn {
    public static void hashMapLearn() {
        HashMap<String, String> map = new HashMap<>();

        // Thêm các cặp khóa-giá trị vào HashMap
        map.put("Alice", "alice@example.com");
        map.put("Bob", "bob@example.com");
        map.put("Carol", "carol@example.com");
        map.put("Barol", "carol@example.com");
        map.put("Darol", "carol@example.com");
        map.put("Earol", "carol@example.com");


        // Lấy giá trị liên quan đến một khóa
        String email = map.get("Alice");

        // In địa chỉ email
        System.out.println(email + "-" + map.size()); // alice@example.com

        for (String url : map.keySet()) {
            System.out.println(url);
        }
    }
}
