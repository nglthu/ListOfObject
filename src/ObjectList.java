
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;


public class ObjectList {

    ArrayList<Student> st = new ArrayList<Student>();
    ArrayList<Book> book = new ArrayList<Book>();
    ArrayList<Object> obj = new ArrayList<Object>();

    


    public ArrayList<Object> addObject(Object stu) {
   // System.out.println("test getClass return :" + stu.getClass().getName());
 
        if(stu.getClass().getName()=="Student") {
            obj.add((Student) stu);
            
            
              return obj;
        }
        else {
            obj.add((Book)stu);
            return obj;
        }



    }

    public  void printObject() throws Exception{

      //  Class<?> clazz = obj.getClass();

       // Field fieldID = clazz.getField("ID");

        for (int i=0; i< obj.size(); i++)


        {
            
            System.out.println(obj.get(i).getClass().getName());
             System.out.println(obj.get(i).hashCode());
            System.out.println(obj.get(i).getClass().getField("ID").getInt(obj.get(i)));

           
        }
  





    }

   
}
