package com.company;

public class Animal {
    public String species;
    public Double weight;
    public String name;
    Boolean alive;

    public Animal(String species) {

        this.species = species;


        if (species.equals("canis")) {
            this.weight = 10.0;
        } else if (species.equals("fenis")) {
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }


    }

    public Animal() {

    }

    public void feed() {
        if (this.weight > 0) {

            this.weight += 1;
            System.out.println("waga: " + weight);
        } else if (this.weight < 0) {
            System.out.println("Karmić martwego ? " + species);
            System.out.println("waga: " + weight);
        }
    }

    public void takeForWalk() {
        if (this.weight > 0) {

            this.weight -= 1;
            System.out.println("waga: " + weight);
        } else if (this.weight <= 0) {
            System.out.println("Martwego na spacer ?");
            System.out.println("waga: " + weight);
        }
    }
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.pet == this) {
            if (buyer.cash > price) {
                buyer.pet = this;
                seller.pet = null;
                seller.cash += price;
                buyer.cash -= price;
                System.out.println(name +" "+ " Sprzedany dla"+" "+buyer);
            } else {
                System.out.println("Brak środków");
            }
        } else {
            System.out.println("Nie ma czym handlować");
        }
    }
    public String toString() {
        return "Species: " + species + " Name: " + name;
    }
}