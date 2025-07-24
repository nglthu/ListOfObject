
import Interfaces.ObjectInterface;

public class Callback {

    private ObjectInterface callbackReference;

    Callback(ObjectInterface cbr) {
        callbackReference = cbr;
    }

    public void test() {
        // goi lai

        callbackReference.readObject();
        System.out.println("call back:" + callbackReference.getClass().getName());
    }

}
