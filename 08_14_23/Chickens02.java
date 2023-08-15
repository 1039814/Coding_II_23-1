public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double dailyAverage,monthlyAverage,monthlyProfit;
        final double Monday_Eggs = 100;
        final double Tuesday_Eggs = 121;
        final double Wensday_Eggs = 117;
        dailyAverage = (Monday_Eggs+Tuesday_Eggs+Wensday_Eggs)/3;
        monthlyAverage = dailyAverage*30.0;
        monthlyProfit = (monthlyAverage*0.18);
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
