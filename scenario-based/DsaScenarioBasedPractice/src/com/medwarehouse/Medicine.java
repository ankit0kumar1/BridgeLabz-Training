package com.medwarehouse;

class Medicine {
    String name;
    int expiryDate; // format: YYYYMMDD

    Medicine(String name, int expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " (Expiry: " + expiryDate + ")";
    }
}

