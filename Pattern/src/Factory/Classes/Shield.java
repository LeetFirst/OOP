package Factory.Classes;

import Factory.Classes.Loot;

import java.util.Random;

public class Shield extends Loot {
    private int protection;
    private int randProtection(){
        Random rand = new Random();
        return rand.nextInt(10);
    }
    public Shield(){
        this.protection = randProtection();
        setWeight(25);
        setNumbCells(4);
    }

    public int getProtection() {
        return protection;
    }
}
