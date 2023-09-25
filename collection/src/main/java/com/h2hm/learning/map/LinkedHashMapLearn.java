package com.h2hm.learning.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapLearn {

    public static void linkedHashMapLearn() {
        LinkedHashMap<String, String> history = new LinkedHashMap<>();
        // Thêm các URL vào lịch sử
        history.put("https://www.google.com/", "Google");
        history.put("https://www.facebook.com/", "Facebook");
        history.put("https://www.youtube.com/", "YouTube");
        history.put("https://www.linkedin.com/", "LinkedIn");
        history.put("https://www.x.com/", "X");
        history.put("https://www.lotus.com/", "Lotus");

        // Duyệt qua lịch sử
        for (String url : history.keySet()) {
            System.out.println(url);
        }
    }
}
