import java.util.List;

public class Main {
    public static void main(String[] args){
        printTask1();
        printTask2();
    }
    public static void printTask1(){
        Task1.pair();
        System.out.println();
        String[] str = {"Jonson", "Adams", "Shepard", "Hols", "Jeremy", "Jo"};
        Task1.secondName(str);
        Task1.lexSort(str);
    }
    public static void printTask2(){
        List <Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        System.out.println(Task2.getEvenNumberPro(list1));
        List<String> list2 = List.of("Egor", "Ivan", "Max", "Petr", "Patric", "Eeee", "");
        System.out.println(Task2.nameFilter(list2, "E"));
    }
}
