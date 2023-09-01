public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        final int MONDAY_EGGS = 100;
        final int TUESDAY_EGGS = 121;
        final int WEDNESDAY_EGGS = 117;
        int threeDaySum = MONDAY_EGGS + TUESDAY_EGGS + WEDNESDAY_EGGS;
        double dailyAverage = threeDaySum / 3.0;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
