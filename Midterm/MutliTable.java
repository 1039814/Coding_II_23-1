package Midterm;

import java.util.Scanner;
public class MutliTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        num = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(num + " x "+ i + " = "+  num*i);
        }
    }
}
