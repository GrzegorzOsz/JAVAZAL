package devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, Integer YearOfProd,Double value) {
        super(producer, model, YearOfProd,value);
    }
    public void refuel(){
        System.out.println("Tankuje Diesla");
    }
}