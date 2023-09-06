public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        double total =calc.findTotal(10, "tanner")
        +calc.findTotal(12, "adam")
        +calc.findTotal(9,  "coda")
        +calc.findTotal(8,  "jakob")
        +calc.findTotal(7,  "sam")
        +calc.findTotal(15, "Alex")
        +calc.findTotal(11, "colin")
        +calc.findTotal(30, "gabe");
        System.out.println("table total $: " + total );

        //Find and print the entire table's total, including tax and tip
       
    } 
}
