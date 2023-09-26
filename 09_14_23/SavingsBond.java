public class SavingsBond {    
    public int term;
    public double interestrate;
    public double buyback;
    public SavingsBond(int userTerm,double purchaseprice){
        term = userTerm;
        if (term<12){
            interestrate = .005;
        }
        else if (term<23){
            interestrate = .01;
        }
        else if (term<35){
            interestrate = .015;
        }
        else if (term<47){
            interestrate = .02;
        }
        else if (term<61){
            interestrate = .025;
        }
        buyback = Math.pow(purchaseprice*(1+interestrate),term);
    }
    public double displaybond(){
        return buyback;
}
}
