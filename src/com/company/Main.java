package com.company;

import devices.Car;
import devices.Phone;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("canis",10.0);
        dog.name = "Szarik";
        FarmAnimal pig = new FarmAnimal("Sus domesticus",300.0);

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
        dog.feed(5.0);

        Car fiat = new Car("fiat","Bravo",2020,10000.0);
        fiat.YearOfProd=2020;
        fiat.value=10000.0;
        Car fiat2 = new Car("fiat","Bravo",2020,10000.0);
        fiat2.YearOfProd=2020;
        fiat2.value=10000.0;
        Car opel = new Car("opel","astra",1998,2000.00);
        opel.YearOfProd=1998;
        opel.value=2000.0;
        Phone iphone = new Phone("apple","iphone 14",2022,5000);
        Phone xiaomi = new Phone("xiaomi","mi12",2022,3000);

        Human me = new Human();
        me.firstname = "Grzegorz";
        me.lastName = "Oszmian";
        me.age = 23;
        me.cash=4000.0;

        Human kup = new Human();
        kup.firstname="Janusz";
        kup.lastName="Biznes";
        kup.age=39;
        kup.cash=0.0;
        kup.pet=dog;
        kup.car= opel;
        kup.phone=iphone;

        me.setSalary(4000);
        me.getSalary();
        me.setCar(fiat);
        System.out.println(dog);
        System.out.println(fiat);
        System.out.println(me);
        fiat.turnOn();
        iphone.turnOn();
        opel.sell(me,kup,2000.0);
        dog.sell(me,kup,500.0);
        iphone.sell(me,kup,1250.0);
        kup.sell(me,kup,1000.0);
        pig.beEaten();
        dog.feed(10.0);

    }
}