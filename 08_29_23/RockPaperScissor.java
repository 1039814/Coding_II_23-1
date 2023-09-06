import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int enemy = (random.nextInt(3));
    System.out.println("what would you like to schoose");
    int userin = sc.nextInt();
    System.out.println(" robots number is : "+enemy);
    }
}
