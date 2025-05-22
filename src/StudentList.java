
import java.util.ArrayList;
import Student;

public class StudentList {

    ArrayList<Student> st = new ArrayList<Student>();

    
    public  ArrayList<Student>  addStudent(Student stu){

        st.add(stu);
        return st;

    }
}
