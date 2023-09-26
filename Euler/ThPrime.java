package Euler;

public class ThPrime{
    static boolean prime;
    public static void main(String[] args) {

        int numofprimes=1;
        long currentprime= 2;
        for(long i = 2L; numofprimes<=10001; i++){
            if(isPrime(i)==true){
                numofprimes++;
                currentprime = i;
            }
            
        }
        System.out.println(numofprimes);
        System.out.println(currentprime);
    }
    public static boolean isPrime(double n){
        for(int i = 2;i < Math.sqrt(n+1);i++){
        if (n%i==0){
            prime = false;
            return prime;
            
        }
        }
        prime = true;
        return prime;
    }
}

