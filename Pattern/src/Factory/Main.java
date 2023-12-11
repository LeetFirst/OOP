package Factory;

import Factory.Classes.Helmet;
import Factory.Classes.Loot;
import Factory.Classes.MagicStaff;

public class Main {
    public static void main(String[] args) {
        Loot loot = Factory.GameLoot(Loots.MAGICSTAFF);
        System.out.println((loot instanceof MagicStaff));
    }
}
