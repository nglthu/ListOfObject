
import Interfaces.ObjectInterface;

public class Callback {

    private ObjectInterface callbackReference;

    Callback(ObjectInterface cbr) {
        callbackReference = cbr;
    }

    public void test() {
        // goi lai

        callbackReference.readObject();
        callbackReference.test();
        
        System.out.println("call back:" + callbackReference.getClass().getName());
    }

    public void testObject(Object obj) {
        // goi lai

        callbackReference.createObject(obj);
        callbackReference.test();
        
        System.out.println("call back:" + callbackReference.getClass().getName());
    }

}
