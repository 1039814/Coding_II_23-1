import java.text.DecimalFormat;

public class SavingsBond {
    public int termLength;
    public double interestRate;
    public double purchasePrice;
    public double amountEarned;
    public static final DecimalFormat dfZero = new DecimalFormat("0.00");

    public SavingsBond(int months, double price){
        termLength = months;
        purchasePrice = price;
        if (termLength >= 1 && termLength <= 11){
            interestRate = 0.005;
        } else if (termLength >= 12 && termLength <= 23){
            interestRate = 0.01;
        } else if (termLength >= 24 && termLength <= 35){
            interestRate = 0.015;
        } else if (termLength >= 36 && termLength <= 47){
            interestRate = 0.02;
        } else if (termLength >= 48 && termLength <= 60){
            interestRate = 0.025;
        } else {
            System.out.println("Invalid Term");
        }
        amountEarned = Double.parseDouble(dfZero.format(purchasePrice * Math.pow(1 + interestRate, termLength))); 
    }

    public void displayBond(){
        System.out.println("Bond Term (in months): " + termLength);
        System.out.println("Bond Rate: " + interestRate);
        System.out.println("Purchased For: $" + purchasePrice);
        System.out.println("Expected Earnings: $" + amountEarned);
    }
}
