
public class testStudentSingle {
    public static void test() {

        Student student1 = new Student("Le Thu Nguyen", 10);
        Student student2 = new Student("Le Van Hung", 99);
        Student student3 = new Student("Nguyen Le Thu", 11, "Hanoi", "Ma345555", 10, 10);

        Book book1 = new Book("Thinking in Java", 100);

        Mark mark1 = new Mark();
        mark1.setName("Mon Toan");

        // ts.testEditDelete();
        ObjectList ol = new ObjectList();

        ol.addObject(book1);
        ol.addObject(student1);
        ol.addObject(student2);
        ol.addObject(student3);

        try {

            ol.printObject();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
