
import java.util.ArrayList;
import Student;

public class StudentList {

    ArrayList<Student> st = new ArrayList<Student>();

    
    public  ArrayList<Student>  addStudent(Student stu){

        st.add(stu);
        return st;

    }

    public ArrayList<Student> getEditStudent(String studentID, String name){

       

        for (int i=0; i < st.size(); i ++){

            if(st.get(i).studentId == studentID){

             st.get(i).fullname = name;
            }

        }

        return st;
    }

    public void printStudentList(){
    int len = st.size();

        for (int i=0; i< len; i++){
        System.out.println("Student ID: "+st.get(i).studentId +" Fullnane: "+st.get(i).fullname);


        }

    }
}
