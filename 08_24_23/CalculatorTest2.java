public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
        Calculator2 Calc2 = new Calculator2();
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party

        Calc2.originalPrice = 10;
        Calc2.findTotal();
        Calc2.originalPrice = 12;
        Calc2.findTotal();
        Calc2.originalPrice = 9;
        Calc2.findTotal();
        Calc2.originalPrice = 8;
        Calc2.findTotal();
        Calc2.originalPrice = 7;
        Calc2.findTotal();
        Calc2.originalPrice = 15;
        Calc2.findTotal();
        Calc2.originalPrice = 11;
        Calc2.findTotal();
        Calc2.originalPrice = 30;
        Calc2.findTotal();
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
    }
}
