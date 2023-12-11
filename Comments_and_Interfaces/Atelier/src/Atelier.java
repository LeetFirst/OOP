import Cloths.Cloth;
import Interfaces.MenСlothing;
import Interfaces.WomenClothing;

public class Atelier {
    public static void dressMens(Cloth[] cloths){
       for(Cloth cloth : cloths){
           if(cloth instanceof MenСlothing){
               ((MenСlothing) cloth).dressMen();
           }
       }
    }

    public static void dressWomens(Cloth[] cloths) {
        for(Cloth cloth : cloths){
            if(cloth instanceof WomenClothing){
                ((WomenClothing) cloth).dressWomen();
            }
        }
    }
}
