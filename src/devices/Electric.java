package devices;

public class Electric extends Car {
    public Electric(String producer, String model, Integer YearOfProd,Double value) {
        super(producer, model, YearOfProd,value);
    }
    public void refuel(){
        System.out.println("Ładuje");
    }
}