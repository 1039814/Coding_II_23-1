import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        int ticketprice =  sc.nextInt();
        System.out.print("Enter the movie rating \n");
        int movierating =  sc.nextInt();
        if( ticketprice >=12  && movierating == 5){
            System.out.println("I\'m interested in watching the movie ");
        }
        else{
            System.out.println("I\'m not interested in watching the movie ");
        }
        sc.close();
    }
}
