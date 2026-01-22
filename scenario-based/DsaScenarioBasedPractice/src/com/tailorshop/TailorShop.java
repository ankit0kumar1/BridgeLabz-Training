package com.tailorshop;

class TailorShop {

    public static void insertionSort(Order[] orders) {

        for (int i = 1; i < orders.length; i++) {
            Order current = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines
            while (j >= 0 && orders[j].deadline > current.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            // Insert order at correct deadline position
            orders[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        Order[] orderList = {
            new Order("O1", "Dev", 20260212),
            new Order("O2", "Rohan", 20260215),
            new Order("O3", "Aman", 20260218),
            new Order("O4", "Ankit", 20260210) // new urgent order
        };

        insertionSort(orderList);

        System.out.println("Orders sorted by delivery deadline:");
        for (Order o : orderList) {
            System.out.println(o);
        }
    }
}
