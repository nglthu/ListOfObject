
import java.util.ArrayList;

import Interfaces.ObjectCreate;
import Interfaces.ObjectInterface;

import java.lang.Object;

public class ObjectList implements ObjectInterface, ObjectCreate{
    //class can implements many Interface

    ArrayList<Object> obj = new ArrayList<Object>();

    public ArrayList<Object> createObject(Object stu) {
        // System.out.println("test getClass return :" + stu.getClass().getName());

        if (stu.getClass().getName() == "Student") {
            obj.add((Student) stu);

            return obj;
        } else {

            if (stu.getClass().getName() == "Mark") {
                obj.add((Mark) stu);

                return obj;

            } else {

                obj.add((Book) stu);
                return obj;
            }
        }

    }

    public void readObject(){
        try {
            for (int i = 0; i < obj.size(); i++)

            {
                System.out.print("Name Of Class :");

                System.out.println(obj.get(i).getClass().getName());
                System.out.print("ID :");
                //getInt
                System.out.println(obj.get(i).getClass().getField("ID").getInt(obj.get(i)));

                System.out.print("Name :");
                //get
                System.out.println(obj.get(i).getClass().getField("Name").get(obj.get(i)));

                System.out.print("String 1 :");

                System.out.println(obj.get(i).getClass().getField("varString1").get(obj.get(i)));

                System.out.print("int  1 :");

                System.out.println(obj.get(i).getClass().getField("varInt1").getInt(obj.get(i)));


            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public ArrayList<Object> deleteObject(Object stu) {
        return obj;
    }

    public ArrayList<Object> editObject(Object stu) {
        return obj;
    }

    public void test(){
        System.out.println("test");
    }
}
