import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        // your code goes here
        String nameInput = console.nextLine();
        int spaceIdx = nameInput.indexOf(" ");
        String firstInitial = nameInput.substring(0, 1);
        String lastName = nameInput.substring(spaceIdx + 1);
        String nameFormatted = lastName + ", " + firstInitial + ".";
        System.out.println("Your name is: " + nameFormatted);
        console.close();
    }
}