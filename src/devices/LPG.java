package devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer YearOfProd,Double value) {
        super(producer, model, YearOfProd,value);
    }
    public void refuel(){
        System.out.println("Tankuje LPG");
    }
}