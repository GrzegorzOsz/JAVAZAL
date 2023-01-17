package devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;


public abstract class Car extends device {
    public List<Human> owners;
    public Car(String producer, String model, int YearOfProd, double value) {
        super(producer, model, YearOfProd, value);
        this.owners = new ArrayList<Human>();
    }

    public boolean equals(Car car) {
        if (this == car) {
            return true;
        } else if (this.model.equals(car.model)
                && this.producer.equals(car.producer)
                && this.value.equals(car.value)) {
            return true;
        } else {
            return false;
        }
    }

    public void sell(Human buyer, Human seller, Double price){
        if(seller.hasCar(this)) {
            if(this.lastOwner() == seller)
                if(buyer.freeSpot()) {
                    if(buyer.cash > price) {
                        seller.removeCar(this);
                        buyer.addCar(this);
                        seller.cash += price;
                        buyer.cash -= price;
                        this.updateOwner(buyer);
                        System.out.println(producer + " " + model + " Sprzedany dla" +" "+ buyer);
                    }
                    else {
                        System.out.println("Brak środków");
                    }
                } else {
                    System.out.println("Brak miejsca w garażu");
                } else {
                System.out.println("Nie ma czym handlować");
            }
        } else {
            System.out.println("Nie ma czym handlować");
        }
    }
    public void turnOn () {
        System.out.println("Przekręcam kluczyk");
    }
    public abstract void refuel();

    public void updateOwner(Human newOwner){
        this.owners.add(newOwner);
        System.out.println("Nowy własciciel pojazdu zapisany.");
    }

    public Human lastOwner(){
        System.out.println("Ostatni właścicicel: " + owners.get(owners.size() - 1).firstname + " " + owners.get(owners.size() - 1).lastName);
        return owners.get(owners.size() - 1);
    }

    public boolean wasOwner(Human human){
        if(owners.contains(human)){
            System.out.println("Tak");
            return true;
        }
        else{
            System.out.println("Nie");
            return false;
        }
    }

    public Boolean transactionList(Human seller, Human buyer){
        if(!this.wasOwner(seller)){
            System.out.println("Nie sprzedawał żadnego samochodu ");
            return false;
        }
        else{
            if(this.owners.indexOf(buyer) == this.owners.indexOf(seller)){
                System.out.println(seller.firstname + " sprzedał samochód dla " + buyer.firstname);
                return true;
            }
            else{
                System.out.println(seller.firstname + " nie sprzedał samochodu dla " + buyer.firstname);
                return false;
            }
        }
    }

    public int transactionCount(){
        System.out.println(this.owners.size());
        return this.owners.size();
    }
}
