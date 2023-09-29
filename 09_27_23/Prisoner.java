//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Prisoner {
    //Fields 
    static private int prisonerCount = 0;
    
    private String name;
    private double height;
    private int bookingnumber;
    private int sentence;
    private Cell cell;
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.cell = cell;
    prisonerCount++;
    this.bookingnumber=prisonerCount;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell());
        System.out.println("prisoner number: " +bookingnumber);
        System.out.println("number of prisoners: " +prisonerCount);
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell getCell() {
        return cell;
    }
    public static int getPrisonerCount() {
        return prisonerCount;
    }

    //Setters
    public static void setPrisonerCount(int prisonerCount) {
        Prisoner.prisonerCount = prisonerCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
