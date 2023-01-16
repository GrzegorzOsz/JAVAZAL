package devices;

public class Phone extends device {
    String producer;
    String model;
    Integer YearOfProd;
    Double value;

    public Phone(String producer, String model, int YearOfProd, double value) {
        super(model, producer, YearOfProd, value);
    }

    public void turnOn() {
        System.out.println("Wciskam przycisk");
    }
}