public class Prize {
    private String name;
    private int requiredTickets;
    private int remainingPrizes;

    public Prize(String name, int requiredTickets, int remainingPrizes) {
        this.name = name;
        this.requiredTickets = requiredTickets;
        this.remainingPrizes = remainingPrizes;
    }

    public String getName() {
        return name;
    }

    public int getRequiredTickets() {
        return requiredTickets;
    }

    public int getRemainingPrizes() {
        return remainingPrizes;
    }

    public void setRemainingPrizes(int remainingPrizes){
        this.remainingPrizes = remainingPrizes;
    }
}
