

public class CheckingAccount {
    public String name;
    public double balance;
    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("balance: " + balance);
    }
    public void withdraw(double amountToWithdraw){
        if(amountToWithdraw>balance){
            System.out.println("cant withdraw more than your account");
        }
        else if(amountToWithdraw<=0){
            System.out.println("cant withdraw amount less than or equal to zero");
        }
        else{
            balance-=amountToWithdraw;
            System.out.println("your balance is: " + balance);
        }
    }
}
