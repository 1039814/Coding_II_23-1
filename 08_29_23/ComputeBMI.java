
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in)  ;
         System.out.println("whats your weight");
         double weight = sc.nextDouble();
         System.out.println("whats your height");
         Double hieght = sc.nextDouble();
         long BMI = Math.round(weight/(hieght*hieght)*703);
        System.out.println("BMI = " + BMI);
        sc.close();
        }
}
