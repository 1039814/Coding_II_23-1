import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        double sum = 0.0, avg = 0.0;
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        System.out.println("Enter scores of 5 students");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            avg = sum / scores.length;
        }
        System.out.println("student averager is: " + avg);
        sc.close();    
    }

}
