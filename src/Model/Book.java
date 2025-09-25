public class Book {
    public String Name;
    public int ID;
    public String varString1; //based on business logic
    public String varString2; //document variable name in Manual 
    public int varInt1;
    public int varInt2;

    public Book(String name, int id) {
        Name = name;
        ID = id;
    }

    public String layName() {
        return Name;
    }
}
