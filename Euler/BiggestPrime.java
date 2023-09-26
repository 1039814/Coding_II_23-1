package Euler;

public class BiggestPrime {
    public static void main(String[] args) {
        for(long i = 1000 ;i<Math.sqrt(600851475143L);i++){
            if(600851475143L%i==0){
            System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
