import java.util.ArrayList;
import java.util.List;

public class testLibrary {

      

      public static void test(){

      Book book1 = new Book("Thinking in Java", 01);
      Book book2 = new Book("Effective in Java", 02);
     
      List<Book> list = new ArrayList<Book>();

      list.add(book1);
      list.add(book2);
    
      Library lib = new Library(list);
      System.out.println(lib.getBooks().get(0).Name);

}
}
