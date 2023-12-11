package Cloths;
import Enums.Color;
import Enums.Size;
import Interfaces.*;
public class Trousers extends Cloth implements MenСlothing, WomenClothing {

    public Trousers(Size size, double price, Color color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел брюки размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела брюки размера " + getSize().name() + ", цвета " + getColor() + ", за " + getPrice());
    }
}
