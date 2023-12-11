import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task1 {
    public static void secondName(String[] arrayList){
        System.out.println(Arrays.stream(arrayList).filter(I -> I.charAt(0) == 'J').toList());
    }
    public static void pair() {
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = rand.nextInt(50);
        int i = 0;
        while(i < n){
            arrayList.add(rand.nextInt(20));
            i++;
        }
        System.out.println(arrayList);
        Stream<Integer> stream = arrayList.stream();
        long count = stream.filter(integer -> (integer%2) ==0).count();
        System.out.println(count);
    }
    public static void lexSort(String[] array){
        System.out.println(Arrays.stream(array).sorted().toList());
    }
}
