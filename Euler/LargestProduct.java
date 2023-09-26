package Euler;
import java.util.Scanner;
public class LargestProduct{
    public static void main(String[] args) {
        long currentprd =1;
        long currentprd2 =1;
        Scanner sc = new Scanner(LargestProduct.class.getResourceAsStream("LargestProduct.txt"));
        for(int i=0;i<1000;i++)
            for(int i2 =1+i;i2<14+i; i2++){
                currentprd2 = currentprd2*sc.nextInt();
            }
        if(currentprd2>currentprd){
            currentprd = currentprd2;
        }

    }
}