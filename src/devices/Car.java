package devices;

public class Car extends device {
    public String model;
    public String producer;
    public Integer YearOfProd;
    public Double value;
    public Car(String producer, String model, int YearOfProd, double value) {
        super(model, producer, YearOfProd, value);
    }
    public  boolean equals (Car fiat){
        if (this == fiat){
            return true;
        } else if (this.model.equals(fiat.model)
                && this.producer.equals(fiat.producer)
                && this.value.equals(fiat.value)){
            return true;
        } else {
            return false;
        }
    }


    public void turnOn(){
        System.out.println("Przekręcam kluczyk");
    }
}