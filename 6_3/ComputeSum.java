import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Please enter a number (0 to exit): ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            sum += num;
        }
        System.out.println("The total is: " + sum);
        sc.close();
    }
}
