
import java.util.ArrayList;
import java.util.Scanner;

public class testStudent {
     ArrayList<Student> sl = new ArrayList<Student>();

    public ArrayList<Student> addList(){
          Student s1 = new Student("Nguyen Thi Lan Anh", 12345);
          Student s2 = new Student("Tran Van Minh", 1);
          sl.add(s1);
          sl.add(s2);
        return sl;
    }

    public void testEdit() {

        ArrayList<Student> sl = new ArrayList<Student>();
        Student s1 = new Student("Nguyen Thi Lan Anh", 12345);
        Student s2 = new Student("Tran Van Minh", 1);

        sl.add(s1);
        sl.add(s2);

        StudentList stuList = new StudentList();
        stuList.addStudent(s1);
        stuList.addStudent(s2);

        // cap nhat thong tin

        System.out.println("Enter student ID");
        Scanner studentID = new Scanner(System.in);

        int s = studentID.nextInt();

        System.out.println("Enter student fullname");

        Scanner fullname = new Scanner(System.in); // Create a Scanner object

        String newName = fullname.nextLine();

        stuList.getEditStudent(newName, s);

        stuList.printStudentList();
        
    }

    public void testDelete(StudentList stuList, int studentID){
        stuList.getDeleteStudent(studentID);
        stuList.printStudentList();


    }

}
