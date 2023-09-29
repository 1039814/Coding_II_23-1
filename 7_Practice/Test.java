public class Test {
    public static void main(String[] args){
        Card card1 = new Card();
        Terminal terminal1 = new Terminal("Xbox", 2500, 1, "Giant Panda", 1000, 10, "Tootsie Roll", 50, 500);
        terminal1.addCredits(card1, 500);
        for (int i = 0; i < 150; i++){
            Game.play(card1);
        }
        terminal1.displayCard(card1);
        terminal1.buyPrizes(card1);
    }
}
