package com.company;

import devices.Car;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "canis";
        dog.weight = 10.0;
        dog.name = "Szarik";

        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed();

        Human me = new Human();
        me.firstname = "Grzegorz";
        me.lastName = "Oszmian";
        me.age = 23;
        me.setSalary(4000);
        me.getSalary();
        Car fiat = new Car("fiat","Bravo",2020,10000.0);
        Car fiat2 = new Car("fiat","Bravo",2020,10000.0);
        Car opel = new Car("opel","astra",1998,2000.00);
        me.setCar(fiat);
        System.out.println(dog);
        System.out.println(fiat);
        System.out.println(me);
    }
}