package Factory.Classes;

import Factory.Classes.Loot;

import java.util.Random;

public class MagicStaff extends Loot {
    private int damage;
    private int randDamage(){
        Random rand = new Random();
        return rand.nextInt(5) + 10;
    }
    public MagicStaff(){
        this.damage = randDamage();
        setWeight(3);
        setNumbCells(5);
    }
}
