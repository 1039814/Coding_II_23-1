import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
    Scanner console = new Scanner(System.in);
    int number = 0;
    number = console.nextInt();
    while( number<0 ){
        System.out.print("Invlad \nType a non-negative integer: ");
        number = console.nextInt();
    }
    double sq = Math.sqrt(number);
    System.out.print(sq+ "\n");
    console.close();
    }
    
}
