import java.util.Random;


public class ComputeMethods {
    
        public double fToc(double degreesf){
        double degreesc = (5/9.0)*(degreesf-32);
        return degreesc;    
    }
        public double hypotenuse(int a, int b){
        double C = Math.sqrt((a*a)+(b*b));
        return C;
    }
    public int roll(){
        Random random = new Random();
        int dice1 = (random.nextInt(6)+1);
        int dice2 = (random.nextInt(6)+1);
        int DiceTotal=dice1+dice2;
        return DiceTotal;
    }
    
}

