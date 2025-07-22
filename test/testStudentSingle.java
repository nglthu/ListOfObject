
public class testStudentSingle {
    public static void test() {

        Student student1 = new Student("Le Thu Nguyen", 10);
        Student student2 = new Student("Le Van Hung", 99);
        Student student3 = new Student("Nguyen Le Thu", 11, "Hanoi", "Ma345555", 10, 10);

        Book book1 = new Book("Thinking in Java", 100);

        Mark mark1 = new Mark();
        mark1.setName("Mon Toan");
        mark1.setID(1);
        mark1.setvarInt1(10);

        // ts.testEditDelete();
        ObjectList ol = new ObjectList();

        ol.createObject(book1);
        ol.createObject(student1);
        ol.createObject(student2);
        ol.createObject(student3);
        ol.createObject(mark1);

        try {

            ol.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
