import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is even.");
        }
        if (num % 2 != 0){
            System.out.println(num + " is odd.");
        }
    }
}
