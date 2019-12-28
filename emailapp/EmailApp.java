/* Basic IT setup for a company's new employees */
 
public class EmailApp {
  
  public static void main(String[] args) {
    Email eml = new Email("John", "Smith");

    // eml.setAlternateEmail("js@gmail.com");
    // System.out.println(eml.getAlternateEmail());
     
    System.out.println(eml.showInfo());
  }
}