import java.util.Scanner;
public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        int p1 = 10;
        int p2 = 12;
        int p3 = 9;
        int p4 = 8;
        int p5 = 7;
        int p6 = 15;
        int p7 = 11;
        int p8 = 20;
        double fp1 = ((p1*1.05)*1.15);
        double fp2 = ((p2*1.05)*1.15);
        double fp3 = ((p3*1.05)*1.15);
        double fp4 = ((p4*1.05)*1.15);
        double fp5 = ((p5*1.05)*1.15);
        double fp6 = ((p6*1.05)*1.15);
        double fp7 = ((p7*1.05)*1.15);
        double fp8 = ((p8*1.05)*1.15);
        System.out.println(fp1);
        System.out.println(fp2);
        System.out.println(fp3);
        System.out.println(fp4);
        System.out.println(fp5);
        System.out.println(fp6);
        System.out.println(fp7);
        System.out.println(fp8);

         
    }    
}
