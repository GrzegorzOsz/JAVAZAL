package com.company;

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
        me.setSalary(4000);
        me.getSalary();
        Car fiat = new Car("fiat","Bravo",2020,10000.0);
        me.setCar(fiat);
    }
}