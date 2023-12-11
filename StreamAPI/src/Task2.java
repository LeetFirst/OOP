import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static List<Integer> getEvenNumberPro(List<Integer> list){
        return list.stream().filter(integer -> integer%2== 0).toList();
    }
    public static List<String> nameFilter(List<String> list, String letter){
        Stream<String> result = list.stream().filter(name -> !name.isEmpty()).map(String::toUpperCase);
        String finalLetter = letter.toUpperCase();
        System.out.println(list.stream().filter(str-> str.startsWith(finalLetter)).count());
        return result.toList();
    }
}
