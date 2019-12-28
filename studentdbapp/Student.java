import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private String classification;
  private String studentID;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int courseCost = 600;
  private static int id = 1000;

  //Constructor: prompt user to enter student's name and year
  public Student(){
    Scanner in = new Scanner(System.in);
    System.out.println("\n==NEW STUDENT==");

    System.out.println("Enter student's first name: ");
    this.firstName = in.nextLine();

    System.out.println("Enter student's last name: ");
    this.lastName = in.nextLine();
    
    System.out.println("\nEnter student's classification:\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n5 - Super Senior");
    this.classification = in.nextLine();
    
    setStudentID();
    
    // System.out.println(firstName + " " + lastName + " " + classification + " " + studentID);
    
  }

  //Generate an ID
  private void setStudentID() {
    //Student ID = classification + ID
    id++;
    this.studentID = classification + "" + id;
  }
  
  //Enroll in courses
  public void enroll() {
    //Get inside a loop until user hits 0
    System.out.println("\n==ENROLLMENT==");
    do {
      System.out.print("Enter a course to enroll (Q to quit): ");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();
      if (!course.equals("Q") && !course.equals("q")) {
        courses +=  "\n -" + course;
        tuitionBalance += courseCost;
      }
      else { 
        break; 
      }
    } while (1 != 0);

    // System.out.println("ENROLLED IN: " + courses);
  }
  
  //View balance
  public void viewBalance(){
    System.out.println("Your balance is: $" + tuitionBalance);
  }
  
  //Pay tuition
  public void payTuition(){
    System.out.println("\n==TUITION PAYMENT==");
    viewBalance();
    System.out.print("Enter your payment: $");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance -= payment;
    System.out.println("Thank you for your payment of $" + payment);
    viewBalance();
  }

  //Show status
  public String printInfo() {
    return "\n==STUDENT==\nName: " + lastName + ", " + firstName + 
            "\nClassification: " + classification +
            "\nStudent ID: " + studentID +
            "\nCourses Enrolled in: " + courses + 
            "\nTuition Balance: $" + tuitionBalance + "\n";
  }
}