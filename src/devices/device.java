package devices;

public abstract class device {
    public String producer;
    public String model;
    public Integer YearOfProd;
    public Double value;

    public Integer getYearOfProd() {
        return YearOfProd;
    }

    public device(String producer,String model, Integer YearOfProd, Double value) {
        this.producer = producer;
        this.model = model;
        this.YearOfProd = YearOfProd;
        this.value = value;
    }

    public String toString() {
        return "Producent: " + producer + " Model: " + model + " Rok produkcji: " + YearOfProd + " Wartość:" + value;
    }
    public abstract void turnOn();
}