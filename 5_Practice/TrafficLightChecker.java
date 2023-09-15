import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code");
        int currentColor = sc.nextInt();
        if (currentColor == 1){
            System.out.println("Next Traffic Light is green");
        } else if (currentColor == 2){
            System.out.println("Next Traffic Light is yellow");
        } else if (currentColor == 3){
            System.out.println("Next Traffic Light is red");
        } else {
            System.out.println("Invalid color");
        }
        sc.close();
    }

}
