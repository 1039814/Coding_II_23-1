//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell cell1 = new Cell("1",false,1043);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell1);
        bubba.display(false);
        cell1.setdoor(1043);
    }
}
