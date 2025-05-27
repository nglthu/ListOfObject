
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

   

        for (int i=0; i< obj.size(); i++)


        {
             System.out.print("Name Of Class :");
            
            System.out.println(obj.get(i).getClass().getName());
            System.out.print("ID :");
            
            System.out.println(obj.get(i).getClass().getField("ID").getInt(obj.get(i)));

            System.out.print("Name :");

            System.out.println(obj.get(i).getClass().getField("Name").get(obj.get(i)));
             
           
        }
  





    }

   
}
