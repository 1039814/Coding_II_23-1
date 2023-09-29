package Euler;
import java.util.Scanner;
public class LargestProduct{
    public static void main(String[] args) {
        long currentprd =1;
        long currentprd2 =1;
        String line = "";
        String currentline;
        String nexttempline;
        int i =0;
        Scanner sc = new Scanner(LargestProduct.class.getResourceAsStream("LargestProduct.txt"));
        currentline = sc.next();
        do{
            for(int i2 = 1;i2<currentline.length()+12; i2++){
                currentline = currentline.substring(1)+sc.next();
                System.out.println(currentline); 
            }
            if(currentprd2>currentprd){
                currentprd = currentprd2;

            }
        i++;
        }while(i<20);
    
    }
}