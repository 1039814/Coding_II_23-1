
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your body weight (in pounds): ");
            double weight = sc.nextDouble();
            System.out.print("Please enter your body height (in inches): ");
            double height = sc.nextDouble();
            long bmi = Math.round((weight / (height * height)) * 703.0);
            System.out.println("Your BMI is: " + bmi);
            sc.close();
                }
}
