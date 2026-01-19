package com.flashdealz;

class FlashDealz {

    public static void quickSort(Product[] products, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(products, low, high);

            quickSort(products, low, pivotIndex - 1);
            quickSort(products, pivotIndex + 1, high);
        }
    }

    private static int partition(Product[] products, int low, int high) {
        int pivot = products[high].discount; // pivot by discount
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Sort in descending order (highest discount first)
            if (products[j].discount >= pivot) {
                i++;
                Product temp = products[i];
                products[i] = products[j];
                products[j] = temp;
            }
        }

        Product temp = products[i + 1];
        products[i + 1] = products[high];
        products[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Product[] deals = {
            new Product("P101", "Laptop", 40),
            new Product("P102", "Headphones", 60),
            new Product("P103", "Smartphone", 30),
            new Product("P104", "Camera", 50),
            new Product("P105", "Smartwatch", 70)
        };

        quickSort(deals, 0, deals.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : deals) {
            System.out.println(p);
        }
    }
}

