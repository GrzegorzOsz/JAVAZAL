package com.company;

import java.util.Date;

public class Human {
    String firstname;
    String lastName;
    Integer age;
    private Double salary;
    private Car car;


    public Double getSalary() {
        System.out.println("wyplata:" + this.salary);
        System.out.println(new Date());
        return this.salary;
    }


    void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Wypłata musi być wieksza niz 0");
        } else {
            System.out.println("Dane wysłane do ksiegowości");
            System.out.println("Odbierz aneks do umowy z kadr");
            System.out.println("Dane wysłane do ZUS i urzędu skarbowego");
            this.salary = salary;
        }
    }
        public Car getCar () {
            return car;
        }

        public void setCar (Car car){
            if (this.salary > car.value) {
                System.out.println("Udało ci się kupić samochód ");
                this.car = car;
            } else if (this.salary > car.value / 12) {
                System.out.println("udało ci się kupić samochód ale na kredyt");
                this.car = car;
            } else {
                System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }
        }
    }