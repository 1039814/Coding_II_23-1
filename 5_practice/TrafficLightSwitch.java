import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a color code ");
        int colorCode = sc.nextInt();
        switch(colorCode){
            case(1):
                System.out.println("your next color is green ");
                break;
            case(2):
                System.out.println("your next color is yellow ");
                break;
            case(3):
                System.out.println("your next color is red ");
                break;
            default:
            System.out.println("invaild input");
            }
        sc.close();
       
    }

}