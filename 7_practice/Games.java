import java.util.Random;
public class Games {
    public static void playgame(Card card){
        Random rand = new Random();
        int temprn =rand.nextInt(0,1000);
        card.settickets(card.gettickets()+temprn);
        card.setCredits(card.getCredits()-5);
        System.out.println("card number: " +card.getCardnumber());
        System.out.println("tickets won: "+ temprn);
        System.out.println("total number of credits: " + card.getCredits());
    }
}
