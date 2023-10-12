package Euler;


public class Collatz {
    public static void main(String[] args) {
        int numberbig = 0;
        long currentnum;
        int numofw = 0;
        long biggestw = 0;
        for(int i = 3; i<1_000_000;i+=2){
            currentnum=i;
            numofw = 1;
            while(!(currentnum==1)){
                if(!(currentnum%2==0)){
                    currentnum= 3*currentnum+1;
                }   
                else{
                    currentnum= currentnum/2;
                }
                numofw++;
            }
            if(numofw>biggestw){
                numberbig =i;
                biggestw = numofw;
            }   
        }
    System.out.println(numberbig);
    } 
}
