package Midterm;

import java.util.Scanner;
public class FourInts{
    public static void main(String[] args) {     
        int i1,i2,i3,i4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        i1 = sc.nextInt();
        System.out.println("Input second number: ");
        i2 = sc.nextInt();
        System.out.println("Input third number: ");
        i3 = sc.nextInt();
        System.out.println("Input fourth number: ");
        i4= sc.nextInt();
        if(i1==i2){
            if(i1==i3){
                if(i1==i4){
                    System.out.println("numbers are all equal");
                }
                else{
                    System.out.println("numbers are not equal!");
                }
            }
            else{
                System.out.println("numbers are not equal!");
            }
        }
        else{
            System.out.println("numbers are not equal!");
        }
        sc.close();
    }
}