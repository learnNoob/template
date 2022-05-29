package com.noob.structural.bridge;

public abstract class AbstractSale {


    private String type;
    private Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }
}
