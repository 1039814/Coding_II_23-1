package Euler;

public class Palindromes{
    public static void main(String[] args) {
        String max = "999",max2 = "999";
        int maxi1 = Integer.parseInt(max);
        int maxi2 = Integer.parseInt(max2);
        int min = 900;
        int firstnumber;
        int Lastnumber;
        String Letter;

        for (;maxi1>min;maxi1--){
            for (;maxi2>min;maxi2--){
                Letter = " "+(maxi1*maxi2);
                firstnumber = Integer.parseInt(Letter.substring(1,2));
                Lastnumber = Integer.parseInt(Letter.substring(Letter.length()-1,Letter.length()));
                if(firstnumber==Lastnumber){
                    firstnumber = Integer.parseInt(Letter.substring(2,3));
                    Lastnumber = Integer.parseInt(Letter.substring(Letter.length()-2,Letter.length()-1));
                    if(firstnumber==Lastnumber){
                        System.out.println(Letter);
                    }
                } 
            } 
            maxi2 = maxi1;
        }
    }
}