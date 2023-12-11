package Factory.Classes;

import java.util.Random;

public class Helmet extends Loot {
    private int protection;
    public Helmet() {
        this.protection = randProtection();
        setWeight(4);
        setNumbCells(4);
    }
    private int randProtection(){
        Random rand = new Random();
        return rand.nextInt(5);
    }
}
