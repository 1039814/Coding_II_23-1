import java.util.Scanner;
public class NameMaker {
    
    public static void main(String args[])
    {
    String firstname;
    String middlename; 
    String lastname; 
    String fullname;
    Scanner sc = new Scanner(System.in);
    System.out.println("whats your first name");
    firstname = sc.next();
    System.out.println("whats your middle name");
    middlename = sc.next();
    System.out.println("whats your last name");
    lastname = sc.next();
    fullname = firstname +" "+ middlename + " " + lastname;
    System.out.println(fullname);
    sc.close();
    }
    
}
