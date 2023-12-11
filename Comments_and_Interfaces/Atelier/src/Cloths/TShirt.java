package Cloths;

import Enums.Color;
import Enums.Size;
import Interfaces.*;

public class TShirt extends Cloth implements MenСlothing, WomenClothing {
    public TShirt(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел футболку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела футболку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}
