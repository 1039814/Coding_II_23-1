import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a color code ");
        int colorCode = sc.nextInt();
        if(colorCode>=1 && colorCode<=3){
            if(colorCode ==1){
                System.out.println("your next color is green ");
            }
            else if (colorCode ==2 ){
                System.out.println("your next color is yellow ");
            }
            else{
                System.out.println("your next color is red ");
            }
        }
        else{
            System.out.println("invaild input");
        }
        sc.close();
    }

}
