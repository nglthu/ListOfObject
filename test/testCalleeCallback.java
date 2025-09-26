import Callback.Callee;
import Callback.Caller;

public class testCalleeCallback {
    
    public static void test() {
        Callee c1 = new Callee();//0
        Callee c2 = new Callee();//0
        Caller caller1 = new Caller(c1);//1
        Caller caller2 = new Caller(c2);//1
        caller1.go();//1
        caller1.go();//2
        caller2.go();//1
        caller2.go();//2
    }
    
}
