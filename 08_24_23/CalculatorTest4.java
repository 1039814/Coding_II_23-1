public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double total = 0;
        //Name your friends
        total += calc.findTotal(10, null);
        total += calc.findTotal(12, null);
        total += calc.findTotal(9,  null);
        total += calc.findTotal(8,  null);
        total += calc.findTotal(7,  null);
        total += calc.findTotal(15, "Alex");
        total += calc.findTotal(11, null);
        total += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        System.out.println(total);
    } 
}
