package Callback;

public class Caller {

    private Incrementable callbackReference;

    public Caller(Incrementable cbh) {
        this.callbackReference = cbh;
    }

    public void go() {
        callbackReference.increment();
    }
    
}
