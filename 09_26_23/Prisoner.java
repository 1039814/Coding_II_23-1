//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    
    //Constructors
    public Prisoner(String name, double height, int sentence, Cell cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.cell = cell;
    }

    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("in cell number" + cell.getname());
        System.out.println("cell door is open is " + cell.getcelldoor());
    }
    public String getname(){
        return name;
    }
    public double getheight(){
        return height;
    }
    public int getsentence(){
        return sentence;
    }
}
