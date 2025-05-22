
import java.util.ArrayList;
import Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Student> sl = new ArrayList<Student>();
        Student s1 = new Student("Nguyen Thi Lan Anh", "msv012344");
        Student s2 = new Student("Tran Van Minh", "msv12345");

        sl.add(s1);
        sl.add(s2);
        /* 
        System.out.println(sl.get(0).fullname);
        System.out.println(sl.get(0).studentId);
        System.out.println(sl.get(1).fullname);
        System.out.println(sl.get(1).studentId); 
        
        */

        StudentList stuList = new StudentList();
        stuList.addStudent(s1);

        int len = stuList.st.size();

        for (int i=0; i< len; i++){
        System.out.println("Student ID: "+stuList.st.get(i).studentId +" Fullnane: "+stuList.st.get(i).fullname);


        }
    }
}
