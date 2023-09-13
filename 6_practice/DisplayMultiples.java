import java.util.Scanner;
public class DisplayMultiples {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what number would you like to know the multipules of? ");
        int num = sc.nextInt();
        for(int i = 0; i<12; i++){
            System.out.println(num+"*"+i+ " = " +num*i);
        }
        sc.close();
    }

}
