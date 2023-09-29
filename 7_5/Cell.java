public class Cell {
    private String name;
    private boolean doorIsOpen;
    private int securityCode;

    public Cell(String name, boolean doorIsOpen, int securityCode){
        this.name = name;
        this.doorIsOpen = doorIsOpen;
        this.securityCode = securityCode;
    }

    public String getName(){
        return name;
    }

    public boolean getIsOpen(){
        return doorIsOpen;
    }

    public void setIsOpen(int code){
        if (code != securityCode){
            System.out.println("That code is incorrect.");
        } else {
            if (doorIsOpen){
                doorIsOpen = false;
                System.out.println("The door is closed.");
            } else {
                doorIsOpen = true;
                System.out.println("The door is open.");
            }
        }
    }
}
