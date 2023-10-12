package Euler;

public class SumofPrimes {
    public static void main(String[] args) {
        long sum = 2L;
        for(long i = 3L; i<=2_000_000; i+=2){
            if(isPrime(i)==true){
                sum += i;
            }
            
        }
        System.out.println( sum);
    }
    public static boolean isPrime(double n){
        boolean prime = true;
        for(int i = 2;i < Math.sqrt(n+1);i++){
            if (n%i==0){
                prime = false;
                return prime;
            
            }
        }
        return prime;
    }
}