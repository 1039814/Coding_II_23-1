public class CalculatorTest3 {
    
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       int result = +calc.findTotal(10,"person1",0)
       +calc.findTotal(12,"person2",0)
       +calc.findTotal(9,"person3",0)
       +calc.findTotal(8,"person4",0)
       +calc.findTotal(7,"person5",0)
       +calc.findTotal(15,"Alex",0)
       +calc.findTotal(11,"person7",0)
       +calc.findTotal(30,"person8",1);
       
       
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
        System.out.println("your total is" + result);
    }    
}
