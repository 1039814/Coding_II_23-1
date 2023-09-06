public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    public int TableTotal;
    
    public int findTotal(double price,String name,int x){
        double total = price*(1+tax+tip);
        System.out.println("$" +total+" " + name);
            System.out.println("$" +TableTotal+" " + "table total");
        
        return TableTotal;
    }
}
