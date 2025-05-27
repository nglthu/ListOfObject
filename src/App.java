
public class App {
    public static void main(String[] args) throws Exception {
       
        
        
        
       // testStudent ts = new testStudent();

        Student st = new Student("abc", 10);
        Book b = new Book("OOP",100);

       // ts.testEditDelete();
        ObjectList ol = new ObjectList();

        ol.addObject(b);
        ol.addObject(st);
       

        ol.printObject();
        
       


    }
}
