import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinNumber = 1234;
        int userInput = 0;
        do {
            System.out.print("Please enter your pin number: ");
            userInput = sc.nextInt();
        } while (userInput != pinNumber);
        System.out.println("The correct PIN has been entered. You may access your account.");
        sc.close();
    }
}