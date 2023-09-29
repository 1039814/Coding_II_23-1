public class Card {
    private int tickets;
    private int credits;
    private static int totalcards =0;
    private int cardnumber;
    
    public Card(int tickets, int credits) {
        this.tickets = tickets;
        this.credits = credits;
        totalcards++;
        cardnumber = totalcards;
        
    }
    //getters
    public int gettickets() {
        return tickets;
    }
    public int getCredits() {
        return credits;
    }
    public int getCardnumber() {
        return cardnumber;
    }
    //setters
    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }
    public void settickets(int tickets) {
        this.tickets = tickets;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
}
