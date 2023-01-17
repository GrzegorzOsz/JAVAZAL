package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;
import devices.device;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Human {
    public String firstname;
    public String lastName;
    public Integer age;
    private Double salary;
    public Car[] garage;
    public Double cash;
    public Animal pet;
    public Phone phone;
    private  static final Integer garageSize = 3;

    Human(){
        this.garage=new Car[garageSize];
    }


    public Double getSalary() {
        System.out.println("wyplata:" + this.salary);
        System.out.println(new Date());
        return this.salary;
    }


    void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Wypłata musi być wieksza niz 0");
        } else {
            System.out.println("Dane wysłane do ksiegowości");
            System.out.println("Odbierz aneks do umowy z kadr");
            System.out.println("Dane wysłane do ZUS i urzędu skarbowego");
            this.salary = salary;
        }
    }

    public Car getCar(Integer garageSize) {
        return this.garage[garageSize];
    }

    public void setCar(Car car,Integer garageSize) {
        if (this.salary > car.value) {
            System.out.println("Udało ci się kupić samochód ");
            this.garage[garageSize] = car;
            car.updateOwner(this);
        } else if (this.salary > car.value / 12) {
            System.out.println("udało ci się kupić samochód ale na kredyt");
            this.garage[garageSize] = car;
            car.updateOwner(this);
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }
    public void sell(Human buyer, Human seller, Double price){
        System.out.println("Handel ludźmi?");
    }

    public String toString() {
        return "Imie: " + firstname + " Nazwisko: " + lastName + " Wiek:" + age;
    }
    public Double garageValue(){
        Double value = 0.0;
        for(int i = 0; i < garage.length; i++){
            if(garage[i] != null){
                value += garage[i].value;
            }
        }
        System.out.println("Value: " + value);
        return value;
    }

    public void sortGarage() {
        Arrays.sort(garage, Comparator.nullsLast(Comparator.comparing(device::getYearOfProd)));
        System.out.println(Arrays.toString(garage));
    }



    public boolean hasCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == car){
                return true;
            }
        }
        return false;
    }

    public boolean freeSpot(){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == car){
                garage[i] = null;
            }
        }
    }
    public void addCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = car;
            }
        }
    }
}