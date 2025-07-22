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
    
     public void setvarString1(String string1){
        this.varString1 = string1;
    }

    public String getvarString1(){
        return varString1 ;
    }

    public void setvarString2(String string2){
        this.varString2 = string2;
    }

    public String getvarString2(){
        return varString2 ;
    }

    public void setvarInt1(int int_1){
        this.varInt1 = int_1;
    }

    public int getvarInt1(){
        return varInt1 ;
    }

    public void setvarInt2(int int_2){
        this.varInt2 = int_2;
    }

    public int getvarInt2(){
        return varInt2 ;
    }
    //Interface 
    //Unimplemented method
    public void printGenericObject();
}
