package com.jeremie.homeshop;

import com.jeremie.homeshop.Delivery;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }
}