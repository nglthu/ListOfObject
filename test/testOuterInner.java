import outer_Inner.OuterClass;

public class testOuterInner {

    public OuterClass outer = new OuterClass();

    //cach goi inner trong outer

    public OuterClass.InnerClass inner = outer.new InnerClass();


    public void test(){
        inner.test();
        
    }

    
    
    
}
