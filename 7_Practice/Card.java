public class Card {
    private int creditBalance;
    private int ticketBalance;
    private int cardNumber;
    private static int numCards = 0;

    public Card(){
        this.ticketBalance = 0;
        this.creditBalance = 0;
        numCards++;
        cardNumber = numCards;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
