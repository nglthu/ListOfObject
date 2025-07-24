import java.util.ArrayList;

public class testCallback {


    public static void  test(){
        Student student1 = new Student("Le Thu Nguyen", 10);
       // Student student2 = new Student("Le Van Hung", 99);
       // Student student3 = new Student("Nguyen Le Thu", 11, "Hanoi", "Ma345555", 10, 10);

       //implements interface
       ObjectList ol = new ObjectList();

      
       ol.createObject(student1);
      

       //call back
       Callback cl = new Callback(ol);
    
       cl.test();


      

    }
    
}
