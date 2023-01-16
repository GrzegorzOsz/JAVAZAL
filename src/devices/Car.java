package devices;

public class Car {
    public final String model;
    public final String producer;
    public final Integer YearOfProd;
    public Double value;


    public Car(String producer, String model, int YearOfProd,Double value) {
        this.producer = producer;
        this.model = model;
        this.YearOfProd = YearOfProd;
        this.value = value;

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

    public String toString() {
        return "Producent: " + producer + " Model: " + model + " Rok produkcji: " + YearOfProd + " Wartość:" + value;

    }
}