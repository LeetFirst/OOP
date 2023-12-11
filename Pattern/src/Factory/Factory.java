package Factory;

import Factory.Classes.*;

public class Factory {
    public static Loot GameLoot(Loots loots) {
        switch (loots) {
            case ARMOR:
                return new Armor();
            case HELMET:
                return new Helmet();
            case MAGICSTAFF:
                return new MagicStaff();
            case SHIELD:
                return new Shield();
            case SWORD:
                return new Sword();
            default: throw new RuntimeException();
        }
    }

}
