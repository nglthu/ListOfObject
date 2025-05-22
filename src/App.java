
import java.util.ArrayList;
import java.util.Scanner;

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
       

        //cap nhat thong tin
        
        System.out.println("Enter student ID");
        Scanner studentID = new Scanner(System.in);  // Create a Scanner object
        String studentCall = studentID.nextLine();
        System.out.println("student ID:"+studentCall);


        System.out.println("Enter student fullname");
        Scanner fullname = new Scanner(System.in);  // Create a Scanner object
        String newName = fullname.nextLine();
        System.out.println("student name:"+newName);

        //Edit
        stuList.editStudent(studentCall, newName);





        //

        
    }
}
