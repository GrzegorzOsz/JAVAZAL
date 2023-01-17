package devices;

import com.company.Human;


public abstract class Car extends device {

    public Car(String producer, String model, int YearOfProd, double value) {
        super(producer, model, YearOfProd, value);
    }
    public  boolean equals (Car car){
        if (this == car){
            return true;
        } else if (this.model.equals(car.model)
                && this.producer.equals(car.producer)
                && this.value.equals(car.value)){
            return true;
        } else {
            return false;
        }
    }
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.car == this) {
            if (buyer.cash > price) {
                buyer.car = this;
                seller.car = null;
                seller.cash += price;
                buyer.cash -= price;
                System.out.println(producer +" "+ model + " Sprzedany dla"+" "+buyer);
            } else {
                System.out.println("Brak środków");
            }
        } else {
            System.out.println("Nie ma czym handlować");
        }
    }

    public void turnOn(){
        System.out.println("Przekręcam kluczyk");
    }
    public abstract void refuel();
}