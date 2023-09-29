//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }

    public Prisoner(){
        name = null;
        height = 0.0;
        sentence = 0;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    
    public void displayPrisoner(){
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Years Sentenced: " + sentence);
    }

    public void displayPrisoner(boolean isThinking){
        displayPrisoner();
        if (isThinking){
            think();
        }
    }
    
    
}
