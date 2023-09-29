//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class Cell {
    String name;
    private boolean isOpen;
    private int securityCode;
    public boolean doorIsOpen;
    
    public Cell(String name, boolean isOpen, int securityCode){
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }
    
    public Cell(String string, boolean b) {
    }

    public String getName(){
        return name;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    
    public void setIsOpen(int code){
        if(code != securityCode){
            System.out.println("Incorrect code");
        }
        else{
            if(isOpen == true){
                isOpen = false;
                System.out.println("Cell " +name +" Closed");
            }
            else{
                isOpen = true;
                System.out.println("Cell " +name +" Open");
            }
        }
    }
}
