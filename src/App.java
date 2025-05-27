
public class App {
    public static void main(String[] args) throws Exception {
       
        
        
        
       // testStudent ts = new testStudent();


        Student st = new Student("Le Thu Nguyen", 10);
        Student s2 = new Student("Le Van Hung", 99);

        Book b = new Book("dkdkdk",100);

       // ts.testEditDelete();
        ObjectList ol = new ObjectList();

        ol.addObject(b);
        ol.addObject(st);
        ol.addObject(s2);
       

        ol.printObject();
        
       


    }
}
