package com.h2hm.learning;

import java.util.Vector;

public class SynchronizeVectorLearning {

    public static void checkSynchronizeVector() {
        try {
            Vector<Integer> vector = new Vector<>();

            // Tạo hai luồng
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 10000; i++) {
                    // Thêm một phần tử vào Vector
                    System.out.println("Put in vector:" + i);
                    vector.add(i);
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 10000; i++) {
                    // Lấy phần tử đầu tiên trong Vector
                    int element = vector.get(i);
                    System.out.println("Get Out vector:" + i);
                }
            });

            // Bắt đầu hai luồng
            thread1.start();

            // Chờ hai luồng kết thúc
            thread1.join();
            thread2.start();
            thread2.join();

            // In ra kích thước của Vector
            System.out.println(vector.size());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
