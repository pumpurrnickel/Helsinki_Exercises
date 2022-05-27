import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        String bookSource = "C://WIN-Program//Full_Stack_103//Intro_to_Java//Helsinki_Part_10_Streams//BooksFromFile//srcBooks.txt";

        List<String> bookRead = read(bookSource);
        
        bookRead.stream()
                .forEach(line -> System.out.println(line));
        

    }
    
    public static List<String> read(String book) {
        
        List<String> bookList = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(book)).forEach(line -> bookList.add(line));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return bookList;

    }

}