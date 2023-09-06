import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wahts your age?");
        int myAge = sc.nextInt();   // I am 19; let me see if I can drive yet
        boolean drivingunderage;
        drivingunderage = (myAge <= 18);
        System.out.println("driving under age is:" + drivingunderage);
        sc.close();
    }
}
