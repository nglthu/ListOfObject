# List of Object
Use ArrayList
```
import java.util.ArrayList;
ArrayList<Object> al = new ArrayList<Object>();
```
## Object

Example
```
class Test{

    int test1;
    String test2;
    Test(int t1, String t2){
        test1 = t1;
        test2 = t2;
    }
}
```
## List Of Object

List of Test object
```
import java.util.ArrayList;
import Test;

class Main{

    public void static main(String [] args){
        Test t1 = new Test(1, 'test1');
        Test t2 = new Test(2, 'test2');

        ArrayList<Test> listTest = new ArrayList<Test>();
        listTest.add(t1);
        listTest.add(t2);

        System.out.println(listTest.get(0).test1);
        System.out.println(listTest.get(0).test2);

    }
}

```