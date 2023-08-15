public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase some "+itemDesc+"";
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 14.99;
        double tax = .125;
        int quantity = 6;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice =  price*(tax + 1)*quantity;

        
        // Modify message to include quantity 
        
        System.out.println(message);
        message = custName + " wants to purchase some " + itemDesc + " total price with tax: " + totalPrice; 
        // Print another message with the total cost
        System.out.println(message);
    }    
}
