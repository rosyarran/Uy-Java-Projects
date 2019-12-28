import java.util.Scanner;

public class Email {
  
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int mailboxCapacity = 500;
  private int defaultPasswordLength = 12;
  private String alternateEmail;
  private String companySuffix = "xyzinc.com";
  
  //Constructor to receive firstName and lastName
  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

    //Call method asking for department - return department
    this.department = setDepartment();
    // System.out.println("Department: " + this.department);

    //Call method that returns random password
    this.password = randomPassword(defaultPasswordLength);
    // System.out.println("Your password: " + this.password);

    //Combine elements to generate email
    email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    // System.out.println("Your email is: " + email);
  }
  
  //Ask for department
  private String setDepartment() {
    System.out.print("\nNEW EMPLOYEE INFORMATION FOR: " + firstName + " " + lastName);
    System.out.print("\n\n--DEPARTMENT CODES--\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\n\nEnter department code: ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if (depChoice == 1) { return "sales"; }
    else if (depChoice == 2) { return "dev"; }
    else if (depChoice == 3) { return "acct"; }
    else { return "staff"; }

  }
  
  //Generate random passwords
  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&_-.";
    char[] password = new char[length];
    for(int i = 0; i < length; i++){
      int rand = (int)(Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }
  
  //Set mailbox capacity
  public void setMailboxCapacity(int capacity) {
    this.mailboxCapacity = capacity;
  }
  
  //Set alternate email
  public void setAlternateEmail(String altEmail) {
    this.alternateEmail = altEmail;
  }
  
  //Change password
  public void changePassword(String password) {
    this.password = password;
  }

  public int getMailboxCapacity() { return mailboxCapacity; }
  public String getAlternateEmail() { return alternateEmail; }
  public String getPassword() { return password; }

  public String showInfo() {
    return "\nNAME: " + lastName + ", " + firstName +
            "\nCOMPANY EMAIL: " + email +
            "\nPASSWORD: " + password +
            "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb\n"; 
  }
}