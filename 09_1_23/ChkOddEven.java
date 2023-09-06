import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();
        int newnum = num%2;
        if (newnum == 0){
            System.out.println("the num "+num +" is even");
        }
        if (newnum == .5){
            System.out.println("the num "+num+" is odd");
        }
        in.close();
    }
}
