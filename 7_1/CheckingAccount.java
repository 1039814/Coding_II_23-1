public class CheckingAccount {
    public double balance;
    public String name;

    public void displayCustomer(){
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public void withraw(double amountToWithraw){
        if (amountToWithraw > balance){
            System.out.println("Your balance is not high enough to withdraw this amount.");
        } else if (amountToWithraw < 0){
            System.out.println("Cannot withdraw a negative amount.");
        } else {
            balance -= amountToWithraw;
            System.out.println("Your new balance is: " + balance);
        }
    }
}
