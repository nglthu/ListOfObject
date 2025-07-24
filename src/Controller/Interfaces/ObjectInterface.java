package Interfaces;
import java.lang.Object;
import java.util.ArrayList;

public interface ObjectInterface {

 

    public ArrayList<Object> createObject(Object obj);

    public ArrayList<Object> deleteObject(Object obj);

    public ArrayList<Object> editObject(Object obj);

    public void readObject();
    public void readObject(ArrayList<Object> o);
    public void test();
}