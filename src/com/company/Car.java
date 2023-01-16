package com.company;

public class Car {
    public final String model;
    public final String producer;
    public final Integer YearOfProd;


    public Car(String producer, String model, int YearOfProd) {
        this.producer = producer;
        this.model = model;
        this.YearOfProd = YearOfProd;

    }
}