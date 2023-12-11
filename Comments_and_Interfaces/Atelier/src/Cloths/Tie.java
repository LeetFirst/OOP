package Cloths;


import Enums.Color;
import Enums.Size;
import Interfaces.*;
public class Tie extends Cloth implements MenСlothing {
    public Tie(Size size, double price, Color color) {
        super(size, price, color);
    }
    @Override
    public void dressMen() {
        System.out.println("Мужчина надел галстук размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

}
