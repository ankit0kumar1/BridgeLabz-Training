package com.icecreamrush;

class IceCreamRush {

    public static void bubbleSort(Flavor[] flavors) {
        int n = flavors.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].sales > flavors[j + 1].sales) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Flavor[] flavors = {
            new Flavor("Vanilla", 42),
            new Flavor("Chocolate", 30),
            new Flavor("Strawberry", 55),
            new Flavor("Mango", 20),
            new Flavor("Butterscotch", 48),
            new Flavor("Coffee", 35),
            new Flavor("Pistachio", 60),
            new Flavor("Black Current", 25)
        };

        bubbleSort(flavors);

        System.out.println("Flavors sorted by popularity:");
        for (Flavor f : flavors) {
            System.out.println(f.name + " -> " + f.sales);
        }
    }
}

