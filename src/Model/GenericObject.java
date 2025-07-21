public abstract class GenericObject {

    public String Name;
    public int ID;
    public String varString1; //based on business logic
    public String varString2; //document variable name in Manual 
    public int varInt1;
    public int varInt2;

    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;

    }
    public void setID(int id){
        this.ID = id;
    }
    public int getID(){
        return ID;
    }

    public void setvarInt1(int diem1){
        this.varInt1 = diem1;
    }

    public int getvarInt1(){
        return varInt1 ;
    }
    //Interface 
    //Unimplemented method
    public void printGenericObject();
}
