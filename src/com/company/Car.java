package com.company;

public class Car {
    public final String model;
    public final String producer;
    public final Integer YearOfProd;
    Double value;


    public Car(String producer, String model, int YearOfProd,Double value) {
        this.producer = producer;
        this.model = model;
        this.YearOfProd = YearOfProd;
        this.value = value;

    }
}