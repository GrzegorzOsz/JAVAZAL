package devices;

public abstract class device {
    public String producer;
    public String model;
    public Integer YearOfProd;
    public Double value;

    public device(String model, String producer, Integer YearOfProd, Double value) {
        this.model = model;
        this.producer = producer;
        this.YearOfProd = YearOfProd;
        this.value = value;
    }

    public String toString() {
        return "Producent: " + producer + " Model: " + model + " Rok produkcji: " + YearOfProd + " Wartość:" + value;
    }
    public abstract void turnOn();
}