package com.h2hm.learning.map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapLearn {

    public static void treeMapLearn() {
        TreeMap<String, String> history = new TreeMap<>();

        // Thêm các cặp khóa-giá trị vào HashMap
        history.put("https://www.google.com/", "Google");
        history.put("https://www.facebook.com/", "Facebook");
        history.put("https://www.youtube.com/", "YouTube");
        history.put("https://www.linkedin.com/", "LinkedIn");
        history.put("https://www.x.com/", "X");
        history.put("https://www.lotus.com/", "Lotus");


        // Lấy giá trị liên quan đến một khóa
        // String email = history.get("Alice");

        // In địa chỉ email

        for (String url : history.keySet()) {
            System.out.println(url);
        }
    }

}
