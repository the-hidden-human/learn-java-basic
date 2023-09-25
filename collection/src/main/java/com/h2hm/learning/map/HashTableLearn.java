package com.h2hm.learning.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableLearn {

    public static void hashTableLearn() {
        Hashtable<String, String> history = new Hashtable<>();

        // Add URLs to the history
        history.put("https://www.x.com/", "X");
        history.put("https://www.lotus.com/", "Lotus");
        history.put("https://www.google.com/", "Google");
        history.put("https://www.facebook.com/", "Facebook");
        history.put("https://www.youtube.com/", "YouTube");
        history.put("https://www.linkedin.com/", "LinkedIn");

        // Iterate over the history
        for (String url : history.keySet()) {
            System.out.println(url);
        }

    }

}
