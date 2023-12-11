package Cloths;

import Enums.Color;
import Enums.Size;
import Interfaces.MenСlothing;
import Interfaces.WomenClothing;

public class Shirt extends Cloth implements WomenClothing {
    public Shirt(Size size, double price, Enums.Color color) {
        super(size, price, color);
    }
    @Override
    public void dressWomen() {
        System.out.println("Женщина надела юбку размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}
