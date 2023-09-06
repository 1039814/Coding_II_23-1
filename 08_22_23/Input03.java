import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);      
        //Find and print the sum of three integers entered by the user
        int I1 = sc.nextInt();
        int I2 = sc.nextInt();
        int I3 = sc.nextInt();
        int Itotal = I1+I2+I3;
        System.out.println(Itotal);
        //Remember to close the Scanner
        sc.close();
    }
}
