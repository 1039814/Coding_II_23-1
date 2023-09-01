import java.util.Random;


public class ComputeMethods {
    public double fToC(double degreesF){
        double degreesC = (5.0/9.0)*(degreesF - 32);
        return degreesC;
    }
    
    public double hypotenuse(int a, int b){
        double hyp = Math.sqrt(a * a + b * b);
        return hyp;
    }

    public int roll(){
        Random rnd = new Random();
        return (rnd.nextInt(6) + 1) + (rnd.nextInt(6) + 1);
    }
}

