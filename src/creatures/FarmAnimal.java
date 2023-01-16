package creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, Double weight) {
        super(species, weight);
        this.alive=true;
    }
    public void beEaten(){
        if(this.weight > 0)
        {
            System.out.println("Zjadłeś zwierze");
            this.weight = 0.00;
        }
        else if(this.weight <= 0)
        {
            System.out.println("Nie ma tu nic jadalnego");
        }
    }
}
