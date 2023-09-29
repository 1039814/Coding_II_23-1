package Midterm;
import java.util.Scanner;
public class DaysInAMonthTest {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month number: ");
        int month = sc.nextInt();
        System.out.println("Input a year: ");
        int yr = sc.nextInt();
        DaysInAmonth month1 = new DaysInAmonth (yr,month);
        System.out.println(month1.daysInAmonth());
        sc.close();
    }
}
