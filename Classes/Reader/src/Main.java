public class Main {
    public static void main(String[] args){
        Reader[] readers = {new Reader("Иванов И.И.", 2229, "ФМиИТ", "10.01.2000", "89602939291"), new Reader("Васильев И.И.", 2230, "ФМиИТ", "10.01.1999", "89602939291"),
                new Reader("Симонов И.И.", 2231, "ФМиИТ", "10.09.2000", "89602939291"), new Reader("Кукев И.И.", 2232, "ФМиИТ", "11.01.2000", "89602939291")};
        Book[] books = {new Book("Война и мир", "Толстой"),
        new Book("Мы", "Замятин"),
        new Book("Мастер и Маргарита", "Булгаков")};
        for(Reader reader: readers){
            reader.takeBook(books);
        }
        System.out.println();
        for(Reader reader: readers){
            reader.returnBook(books);
        }
    }
}