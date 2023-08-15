public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int mondayeggs;
        int tuesdayeggs;
        int wensdayeggs;
        int eggsperchicken = 4 ;
        int totalEggs ;
        int chickencount= 8 ;
        //monday
        mondayeggs = eggsperchicken*chickencount;
        //tuesday
        chickencount += 1 ;
        tuesdayeggs = eggsperchicken*chickencount;
        //wensday
        chickencount = chickencount/2;
        wensdayeggs = eggsperchicken*chickencount;
        totalEggs = mondayeggs + tuesdayeggs + wensdayeggs;
        System.out.println(totalEggs);
    }   
}
