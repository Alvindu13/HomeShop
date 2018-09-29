package com.jeremie.homeshop;

public class Television extends Product {
    private int size;
    private String slabType;


    public Television(String name, String description, double price, int size) {
        super(name, description, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }
}


