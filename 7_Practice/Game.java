import java.util.Random;

public class Game {
    public static void play(Card card){
        if (card.getCreditBalance() > 2){
            card.setCreditBalance(card.getCreditBalance() - 2);
            Random rand = new Random();
            int ticketsWon = rand.nextInt(1, 51);
            card.setTicketBalance(card.getTicketBalance() + ticketsWon);
            System.out.println("Card Number: " + card.getCardNumber());
            System.out.println("Tickets Won: " + ticketsWon);
            System.out.println("New Ticket Balance: " + card.getTicketBalance());
        } else {
            System.out.println("You have insufficient credits to play.");
        }
    }
}
