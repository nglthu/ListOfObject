

import java.util.ArrayList;
import java.util.Scanner;


public class testStudent {

    public void test(){

         ArrayList<Student> sl = new ArrayList<Student>();
        Student s1 = new Student("Nguyen Thi Lan Anh", 12345);
        Student s2 = new Student("Tran Van Minh", 1111);

        sl.add(s1);
        sl.add(s2);
        /* 3
        System.out.println(sl.get(0).fullname);
        System.out.println(sl.get(0).studentId);
        System.out.println(sl.get(1).fullname);
        System.out.println(sl.get(1).studentId); 
        
        */

        StudentList stuList = new StudentList();
        stuList.addStudent(s1);
        stuList.addStudent(s2);

        //cap nhat thong tin
        
        System.out.println("Enter student ID");
        Scanner studentID = new Scanner(System.in) ;

int s = studentID.nextInt();
       
    

        System.out.println("Enter student fullname");

        Scanner fullname = new Scanner(System.in);  // Create a Scanner object

        String newName = fullname.nextLine();
      
      

        stuList.getEditStudent(newName, s);
       
        stuList.printStudentList();
        


    }
    
}
