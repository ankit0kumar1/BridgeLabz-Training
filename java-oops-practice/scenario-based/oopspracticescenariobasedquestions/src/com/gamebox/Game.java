package com.gamebox;

abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    protected Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Operator usage for seasonal offers
    public void applyDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully");
    }
}

