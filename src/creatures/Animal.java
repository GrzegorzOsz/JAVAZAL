package creatures;

import com.company.Human;

public abstract class Animal implements Feedable {
    public String species;
    public Double weight;
    public String name;
    public Boolean alive;

    public Animal(String species, Double weight) {

        this.species = species;
        this.weight = weight;
        this.alive = true;


    }


    public void feed() {
        if (this.weight <= 0.0) {
            alive=false;
            System.out.println("Nie nakarmisz trupa");
        } else this.weight++;
        System.out.println("Waga zwierzęcia: " + weight);

    }

    public void feed(Double foodWeight) {
        if (this.weight <= 0.0) {
            alive=false;
            System.out.println("Nie nakarmisz trupa");
        } else this.weight += foodWeight;
        System.out.println("Waga zwierzęcia: " + weight);
    }

        public void takeForWalk() {
            if (this.weight <= 0.0) {
                alive = false;
                System.out.println("Trupa na spacer ?");
            } else {
                this.weight--;
                System.out.println("Waga zwierzęcia: " + weight);
            }
        }



    public void sell(Human buyer, Human seller, Double price) {
        if (seller.pet == this) {
            if (buyer.cash > price) {
                buyer.pet = this;
                seller.pet = null;
                seller.cash += price;
                buyer.cash -= price;
                System.out.println(name +" "+ " Sprzedany dla"+" "+buyer);
            } else {
                System.out.println("Brak środków");
            }
        } else {
            System.out.println("Nie ma czym handlować");
        }
    }
    public String toString() {
        return "Species: " + species + " Name: " + name;
    }
}