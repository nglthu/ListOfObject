
import java.util.ArrayList;
import Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Student> sl = new ArrayList<Student>();
        Student s = new Student("test", "abc");
        sl.add(s);

        System.out.println(sl.get(0).fullname);

    }
}
