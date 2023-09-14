import java.util.Scanner;

public class JavaLibsPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //whats your name 
        System.out.println("whats your name");
        String Name = sc.nextLine();
        System.out.println("Ok " +Name + " who do you want main character to be");
        //String noun1 = sc.nextLine();
        System.out.println("give a time");
        int lenthMins = sc.nextInt();
        double lenthHrs = (lenthMins/60.0);
        int indesive = 1;
        while (indesive == 1){
            System.out.println("are you sure you want "+lenthHrs+ "hr as your time");
            String indesiveOut = sc.next();
            if(indesiveOut.equals("no")){
                System.out.println("Ok " +Name + " who do you want main character to be");
                lenthMins = sc.nextInt();
                lenthHrs = (lenthMins/60.0);
            }
            else{
                indesive = 0;
            }
        }
        sc.close();
    }   
}