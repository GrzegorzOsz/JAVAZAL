package devices;

import com.company.Human;

public class Phone extends device {

    public Phone(String producer, String model, int YearOfProd, double value) {
        super(model, producer, YearOfProd, value);
    }

    public void sell(Human buyer, Human seller, Double price) {
       if (seller.phone == this) {
            if (buyer.cash > price) {
                buyer.phone = this;
                seller.phone = null;
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

    public void turnOn() {
        System.out.println("Wciskam przycisk");
    }
}