package com.artexpo;

class ArtExpo {

    public static void insertionSort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {
            Artist current = artists[i];
            int j = i - 1;

            // Shift artists who registered later
            while (j >= 0 && artists[j].registrationTime > current.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            // Insert artist at correct time position
            artists[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        Artist[] registrations = {
            new Artist("Aditi", 930),
            new Artist("Rohan", 945),
            new Artist("Meera", 1000),
            new Artist("Kabir", 915),
            new Artist("Sana", 1010)
        };

        insertionSort(registrations);

        System.out.println("Artists sorted by registration time:");
        for (Artist a : registrations) {
            System.out.println(a.name + " -> " + a.registrationTime);
        }
    }
}

