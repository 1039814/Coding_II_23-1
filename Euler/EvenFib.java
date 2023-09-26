package Euler;
public class EvenFib{

    public static void main(String[] args) {
        int num = 1;
        int pnum = 0;
        long sumeven = 0L;
        for(;num<4_000_000;){
            num+=pnum;
            pnum=num-pnum;
            if(num%2==0){
                sumeven+=num;
            }
        }
        System.out.println(num);
        System.out.println(sumeven);

    }
}