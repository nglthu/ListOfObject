import Abstract.Leg;
import Interfaces.Animal;
import Interfaces.HandInterface;

public class Dog implements HandInterface, LegInterface, Animal {
  
    public void test() {
        System.out.println("Woof");
    }
    public void walk() {
        System.out.println("The dog is walking by feet");
    }
    public void grab() {
        System.out.println("Grabbed by hand");
    }

    public void noOfLegs() {
        
        throw new UnsupportedOperationException("Unimplemented method 'noOfLegs'");
    }
    public void noOfHands() {
        
        throw new UnsupportedOperationException("Unimplemented method 'noOfHands'");
    }
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}