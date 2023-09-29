import java.util.Scanner;

public class Terminal {
    private Prize bigPrize;
    private Prize mediumPrize;
    private Prize smallPrize;

    public Terminal(String bigPrizeName, int bigPrizeCost, int bigPrizeCount, String mediumPrizeName, int mediumPrizeCost, int mediumPrizeCount, String smallPrizeName, int smallPrizeCost, int smallPrizeCount){
        bigPrize = new Prize(bigPrizeName, bigPrizeCost, bigPrizeCount);
        mediumPrize = new Prize(mediumPrizeName, mediumPrizeCost, mediumPrizeCount);
        smallPrize = new Prize(smallPrizeName, smallPrizeCost, smallPrizeCount);
    }

    public void addCredits(Card currentCard, int money){
        int credits = money * 2;
        currentCard.setCreditBalance(currentCard.getCreditBalance() + credits);
    }

    public void exchangeCredits(Card givingCard, Card receivingCard, int creditAmount){
        if (givingCard.getCreditBalance() >= creditAmount){
            receivingCard.setCreditBalance(receivingCard.getCreditBalance() + creditAmount);
            givingCard.setCreditBalance(givingCard.getCreditBalance() - creditAmount);
        } else {
            System.out.println("This card has insufficient credits to complete the transfer.");
        }
    }

    public void exchangeTickets(Card givingCard, Card receivingCard, int ticketAmount){
        if (givingCard.getTicketBalance() >= ticketAmount){
            receivingCard.setTicketBalance(receivingCard.getTicketBalance() + ticketAmount);
            givingCard.setTicketBalance(givingCard.getCreditBalance() - ticketAmount);
        } else {
            System.out.println("This card has insufficient tickets to complete the transfer.");
        }
    }

    public void buyPrizes(Card card){
        String keepBuying = "Y";
        Scanner sc = new Scanner(System.in);
        while (keepBuying.toUpperCase().equals("Y")){
            System.out.println(bigPrize.getName() + " cost: " + bigPrize.getRequiredTickets());
            System.out.println(mediumPrize.getName() + " cost: " + mediumPrize.getRequiredTickets());
            System.out.println(smallPrize.getName() + " cost: " + smallPrize.getRequiredTickets());
            System.out.println("Your Tickets Remaining: " + card.getTicketBalance());
            System.out.println("Which would you like? (1) " + bigPrize.getName() + ", (2) " + mediumPrize.getName() + ", (3) " + smallPrize.getName());
            String response = sc.next();
            while (!response.equals("1") && !response.equals("2") && !response.equals("3")) {
                System.out.println("That was not a valid response. Please try again: ");
                response = sc.next();
            }
            Prize selection;
            if (response.equals("1")){
                selection = bigPrize;
            } else if (response.equals("2")){
                selection = mediumPrize;
            } else {
                selection = smallPrize;
            }
            if (selection.getRemainingPrizes() < 1){
                System.out.println("There are no more of those left! Sorry!");
            } else if (card.getTicketBalance() < selection.getRequiredTickets()){
                System.out.println("You don't have enough tickets for that prize! Sorry!");
            } else {
                System.out.println("Congratulations! You bought a " + selection.getName());
                selection.setRemainingPrizes(selection.getRemainingPrizes() - 1);
                card.setTicketBalance(card.getTicketBalance() - selection.getRequiredTickets());
            }
            System.out.println("Would you like to buy something else? (Y/N)");
            keepBuying = sc.next();
            while (!keepBuying.equalsIgnoreCase("Y") && !keepBuying.equalsIgnoreCase("N")){
                System.out.println("Your response is not valid. Please respond Y/N.");
                keepBuying = sc.next();
            }
        }
        sc.close();
    }

    public void displayCard(Card currentCard){
        System.out.println("Card Number: " + currentCard.getCardNumber());
        System.out.println("Credit Balance: " + currentCard.getCreditBalance());
        System.out.println("Ticket Balance: " + currentCard.getTicketBalance());
    }
}
