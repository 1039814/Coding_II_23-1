import java.util.Scanner;
public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what month is your birthday");
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("your bithday is in january");
                break;
            case 2:
                System.out.println("your bithday is in febuary");
                break;
            case 3:
                System.out.println("your bithday is in march");
                break;
            case 4:
                System.out.println("your bithday is in april");
                break;
            case 5:
                System.out.println("your bithday is in may");
                break;
            case 6:
                System.out.println("your bithday is in june");
                break;
            case 7:
                System.out.println("your bithday is in july");
                break;
            case 8:
                System.out.println("your bithday is in august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("your bithday is in october");
                break;
            case 11:
                System.out.println("your bithday is in november");
                break;
            case 12:
                System.out.println("your bithday is in december");
                break;
            default:
                System.out.println("invaild input");
        }
        sc.close();
    }
}
