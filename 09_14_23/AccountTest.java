
public class AccountTest {
    public static  void main(String[] args) {

        CheckingAccount account = new CheckingAccount();
        account.balance = 1000;
        account.name = "Mr.G";
        account.withdraw(10000);
        SavingsBond bond = new SavingsBond(40,30);
        System.out.println(bond.displaybond());

    }
}
