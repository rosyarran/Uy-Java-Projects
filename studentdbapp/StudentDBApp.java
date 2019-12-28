import java.util.Scanner;

public class StudentDBApp {
  public static void main(String[] args) {
    
    //Ask how many new users we want to add
    System.out.println("Enter number of new students to enroll: ");
    Scanner in = new Scanner(System.in);
    int numOfStudents = in.nextInt();
    Student[] students = new Student[numOfStudents];

    //Create n number of new students
    for(int n = 0; n < numOfStudents; n++){
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
    }

    System.out.println("\n ****************\n * FULL  ROSTER *\n ****************");
    for(int n = 0; n < numOfStudents; n++){
      System.out.print(students[n].printInfo());
    }
    
  }
}