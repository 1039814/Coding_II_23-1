package Euler;

public class DiffenceOfSqrt {
    public static void main(String[] args) {
        
    
        long sumofsqrs = 0L;
        long sumofsumssqred = 0L;
        long sum = 0L;
        int max = 100;
        for(double i=1;i<max+1;i++){
            sumofsqrs += i*i;
        }
        for(double i=1;i<max+1;i++){
            sumofsumssqred +=i;
        }
        sum = sumofsumssqred*sumofsumssqred;
        System.out.println(sum-sumofsqrs);
        //System.out.println(sumofsumssqred);
    }
}
