package com.company;

public class Animal {
    public String species;
    public Double weight;
    String name;
    String color;
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

    public String toString() {
        return "Species: " + species + " Name: " + name;
    }
}