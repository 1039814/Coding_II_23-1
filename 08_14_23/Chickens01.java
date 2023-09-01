public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int totalEggs = 0;
        int chickenCount = 8;
        int eggsPerChicken = 4;
        //Monday
        totalEggs = chickenCount * eggsPerChicken;
        //Tuesday
        totalEggs += ++chickenCount * eggsPerChicken;
        //Wednesday
        totalEggs += chickenCount / 2 * eggsPerChicken;
        System.out.println(totalEggs);
    }   
}
