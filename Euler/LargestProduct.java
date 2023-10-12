package Euler;
import java.util.Scanner;
public class LargestProduct{
    public static void main(String[] args) {
        long currentprd =1;
        long currentprd2 =1;

        String currentline;
        String nexttempline;
        Scanner sc = new Scanner(LargestProduct.class.getResourceAsStream("LargestProduct.txt"));
        currentline = sc.next();
        
        for(int i = 13; i<currentline.length();i++){
            nexttempline = currentline.substring(i-13, i);
            //System.out.println(nexttempline);
            for(int i2 =0; i2<nexttempline.length();i2++){
                currentprd= currentprd*Integer.parseInt(nexttempline.substring(i2, i2+1));
            }

            if(currentprd>currentprd2){
                currentprd2 = currentprd;
            }
            currentprd = 1;
        }
        System.out.println(currentprd2);
    }
}