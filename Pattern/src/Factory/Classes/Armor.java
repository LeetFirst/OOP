package Factory.Classes;

import java.util.Random;

public class Armor extends Loot {
    private int protection;
    public Armor() {
        this.protection = randProtection();
        setWeight(30);
        setNumbCells(20);
    }
    private int randProtection(){
        Random rand = new Random();
        return rand.nextInt(5);
    }
}
