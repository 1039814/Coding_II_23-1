package Midterm;
import java.util.Scanner;
public class InchToMeterTest {
    public static void main(String[] args) {
        int inch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        inch = sc.nextInt();
        InchToMeter im = new InchToMeter(inch);
        System.out.println(inch+ " inches is "+im.setmter()+" meters");
        sc.close();
    }
}