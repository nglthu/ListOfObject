import Interfaces.Animal;
import Interfaces.Human;

public class giongLoai implements Animal, Human {

    public int  leg(){

        //so chan nguoi
        return 4;
    }

    public int hand(){
        return 2;
    }
    
}
