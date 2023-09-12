package Euler;


public class multipuseof3_5 {
     public static void main(String[] args) {
        
    
        long sum=0L,sum5=0L;
        //int cn3 =3 ,cn5 = 5;
        final int M =1000;
        
        for (int iter3=0; iter3<M; iter3+=3) {
            sum+=iter3; 
        }
        System.out.println(sum);
        for (int iter5=0; iter5<M; iter5+=5) {
            sum5+=iter5; 

        }
        System.out.println(sum5+sum);
    }  
}
