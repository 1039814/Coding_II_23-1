import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num (0 to exit)");
        int num =sc.nextInt();
        int sum = 0;
        for(int i = 0; i<10; i++){
            
            if(num==0){
                break;
            }
            else{
                sum = num + sum;
            }
            System.out.println("enter a num (0 to exit)");
            num =sc.nextInt(); 
        }
        System.out.println(sum);
        sc.close();
        
    }
}
