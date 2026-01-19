package com.bagnballorganizer;

class Ball implements Storable {

    private String id;
    private String color;
    private String size; // small / medium / large

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{id='" + id + "', color='" + color + "', size='" + size + "'}";
    }
}

