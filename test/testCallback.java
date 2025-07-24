
public class testCallback {

    public static void test() {
        Student student1 = new Student("Le Thu Nguyen", 10);
        Student student2 = new Student("Le Van Hung", 99);
        Student student3 = new Student("Nguyen Le Thu", 11, "Hanoi", "Ma345555", 10, 10);

        Book b = new Book("Thinking in Java", 100);

        // implements interface
        ObjectList ol = new ObjectList();

        // call back
        Callback cl = new Callback(ol);
        cl.testObject(student1);
        cl.testObject(student2);
        cl.testObject(student3);
        cl.testObject(b);
        cl.test();

    }

}
