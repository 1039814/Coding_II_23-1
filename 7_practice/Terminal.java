public class Terminal {
    private int numberofprizes=0;
    private int terminals =0;
    private int terminalnumber;
    public Terminal() {
        terminalnumber= terminals;
    }
    public int getTerminalnumber() {
        return terminalnumber;
    }
    public void setTerminalnumber() {
        terminalnumber=terminals;
    }
    public void checkbalance(Card card){
        System.out.println("credit balance on card" +card.getCardnumber()+ ": " + card.getCredits());
    }
    public void addcredits(int moneyin,Card card){
        int credits;
        credits=2*moneyin;
        card.setCredits(credits+card.getCredits());
        System.out.println("credit balance on card" +card.getCardnumber()+": "+card.getCredits());
        System.out.println("tickets on card" +card.getCardnumber()+": "+card.gettickets());
    }
    public void swaptickets(Card card1,Card card2,int number){
        card2.settickets(card2.gettickets()-number);
        card1.settickets(card1.gettickets()+number);
        System.out.println("tickets balance on card" +card1.getCardnumber()+": "+card1.gettickets());
        System.out.println("tickets balance on card" +card2.getCardnumber()+": "+card2.gettickets());
    }
    public void swapcredits(Card card1,Card card2,int number){
        card2.setCredits(card2.getCredits()-number);
        card1.setCredits(card1.getCredits()+number);
        System.out.println("credit balance on card" +card1.getCardnumber()+": "+card1.getCredits());
        System.out.println("credit balance on card" +card2.getCardnumber()+": "+card2.getCredits());
    }
    public void createPrize(int tckwor,int stock,String name){
        numberofprizes++;
        if (numberofprizes>3){
            System.out.println("cannot create more prizes");
        }
        else{
            if(numberofprizes==1){
                Prizes p1 = new Prizes(tckwor,stock,name);
            }
             if(numberofprizes==2){
                Prizes p2 = new Prizes(tckwor,stock,name);
            } if(numberofprizes==3){
                Prizes p3 = new Prizes(tckwor,stock,name);
            }
        }
    }
}
