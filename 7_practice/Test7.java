public class Test7 {
    public static void main(String[] args) {
        Card card1 = new Card(0,200);
        Card card2 = new Card(0,200);
        Terminal t1 = new Terminal();
        Games.playgame(card1);
        Games.playgame(card1);
        Games.playgame(card2);
        Games.playgame(card2);
        Games.playgame(card2);
        t1.checkbalance(card2);
        t1.addcredits(5, card2);
        t1.swapcredits(card1,card2,5);



    }
}
