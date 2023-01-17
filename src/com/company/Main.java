package com.company;

import devices.*;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
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

        LPG fiat = new LPG("fiat","Bravo",2020,10000.0);
        fiat.YearOfProd=2020;
        fiat.value=10000.0;
        LPG fiat2 = new LPG("fiat","Bravo",2020,10000.0);
        fiat2.YearOfProd=2020;
        fiat2.value=10000.0;
        Diesel opel = new Diesel("opel","astra",1998,2000.00);
        opel.YearOfProd=1998;
        opel.value=2000.0;
        Electric tesla = new Electric("Tesla","S",2018,30000.00);
        tesla.YearOfProd=2018;
        tesla.value=30000.0;
        Phone iphone = new Phone("apple","iphone 14",2022,5000);
        Phone xiaomi = new Phone("xiaomi","mi12",2022,3000);

        Human me = new Human();
        me.firstname = "Grzegorz";
        me.lastName = "Oszmian";
        me.age = 23;
        me.cash=24000.0;

        Human kup = new Human();
        kup.firstname="Janusz";
        kup.lastName="Biznes";
        kup.age=39;
        kup.cash=0.0;
        kup.pet=dog;
        kup.phone=iphone;

        me.setSalary(8000.0);
        me.getSalary();
        kup.setSalary(10000.0);
        kup.getSalary();
        me.setCar(fiat,1);
        System.out.println(dog);
        System.out.println(fiat);
        System.out.println(me);
        fiat.turnOn();
        iphone.turnOn();
        dog.sell(me,kup,500.0);
        iphone.sell(me,kup,1250.0);
        kup.sell(me,kup,1000.0);
        pig.beEaten();
        dog.feed(10.0);
        tesla.refuel();
        opel.refuel();
        fiat.refuel();
        iphone.installAnApp("Facebook");
        iphone.installAnApp("Instagram","7.22");
        xiaomi.installAnApp("Pyszne.pl","4.20","4325");
        List<String> appNames = new LinkedList<>();
        appNames.add("Netflix");
        appNames.add("WhatsApp");
        iphone.installAnApp(appNames);
        URL url1 = new URL("https","wsb.pl",7546,"Extranet");
        xiaomi.installAnApp(url1);
        kup.setCar(fiat,0);
        kup.setCar(tesla,1);
        kup.setCar(opel,2);
        kup.garageValue();
        me.setCar(fiat2,1);
        me.garageValue();
        kup.sortGarage();
        opel.sell(me,kup,10000.0);
        me.getCar(2);

    }
}