public class Prizes {
    private int tckwor;
    private int stock;
    private String name;
    public Prizes(int tckwor, int stock, String name) {
        this.tckwor = tckwor;
        this.stock = stock;
        this.name = name;
    }
    public int getTckwor() {
        return tckwor;
    }
    public void setTckwor(int tckwor) {
        this.tckwor = tckwor;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getName() {
        return name;
    }
}
