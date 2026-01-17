package com.artexpo;

class ArtExpo {

    public static void insertionSort(int[] registrationTimes) {
        for (int i = 1; i < registrationTimes.length; i++) {
            int currentArtistTime = registrationTimes[i];
            int j = i - 1;

            // Shift later registrations to the right
            while (j >= 0 && registrationTimes[j] > currentArtistTime) {
                registrationTimes[j + 1] = registrationTimes[j];
                j--;
            }

            // Insert the artist at the correct time position
            registrationTimes[j + 1] = currentArtistTime;
        }
    }

    public static void main(String[] args) {
        int[] registrations = {930, 945, 1000, 915, 1010};

        insertionSort(registrations);

        for (int time : registrations) {
            System.out.print(time + " ");
        }
    }
}

