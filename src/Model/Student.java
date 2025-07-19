public class Student {
    public String Name;
    public int ID;
    public String varString1; //based on business logic
    public String varString2; //document variable name in Manual 
    public int varInt1;
    public int varInt2;

    Student(String name, int id){
        Name = name;
        ID = id;
    }

    Student(String name, int id, String va1, String va2, int intva1, int intva2){
        Name = name;
        ID = id;
        varString1 = va1;
        varString2 = va2;
        varInt1 = intva1;
        varInt2 = intva2;
    }

    public String layName(){
        return Name;
    }
}
