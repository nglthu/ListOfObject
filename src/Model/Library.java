import java.util.List;

public class Library{
   public List<Book> books;
   public Library(){

   }
   public Library(List<Book> b){
    books = b;
   
   }


   //get book
   public List<Book> getBooks(){
    return books;
   }
}