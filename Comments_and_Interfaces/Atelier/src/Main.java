import Cloths.*;
import Enums.Color;
import Enums.Size;

public class Main {
    public static void main(String[] args){
        Cloth[] cloth = {
                new TShirt(Size.XXS, 500, Color.RED),
                new Trousers(Size.M, 1500, Color.BLUE),
                new TShirt(Size.L, 2000, Color.BROWN),
                new Shirt(Size.S, 1000, Color.GREEN),
                new Tie(Size.M, 800, Color.WHITE)};
        Atelier.dressMens(cloth);
        System.out.println();
        Atelier.dressWomens(cloth);
    }
}
