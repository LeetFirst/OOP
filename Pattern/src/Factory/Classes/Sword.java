package Factory.Classes;
import Factory.Classes.Loot;

import java.util.Random;

public class Sword extends Loot {
    private int damage;
    private int randDamage(){
        Random rand = new Random();
        return rand.nextInt(5) + 10;
    }
    public Sword(){
        this.damage = randDamage();
        setWeight(10);
        setNumbCells(2);
    }

    public int getDamage() {
        return damage;
    }
}
