import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        // your code goes here
        String fullname = console.nextLine();
        String firstname = fullname.substring(0,fullname.indexOf(" " ));
        String lastname = fullname.substring(firstname.length());
        String firstletter = firstname.substring(0,1);
        String firstletter2 = firstletter.toUpperCase()+".";
        System.out.println("your name is :"+lastname + ", " +firstletter2 );
    }
}