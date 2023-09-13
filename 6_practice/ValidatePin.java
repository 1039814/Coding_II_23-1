import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        final int fpin = 6384;
        Scanner sc = new Scanner(System.in);
        int pin = 0 ;
        String enter = "enter";
        do{
        System.out.println(enter + " validation pin");
        enter ="reenter"; 
        pin  = sc.nextInt();
        }while(!(pin==fpin));
        System.out.println("you have gianed acesses");
        sc.close();
    }

}
