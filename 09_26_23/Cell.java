public class Cell{
    private String name;
    private boolean celldoor;
    private int seruritycode;
    //contructors 
    public Cell(String name, boolean celldoor,int seruritycode){
        this.name = name;
        this.celldoor = celldoor;
        this.seruritycode = seruritycode;
    }
    public String getname(){
        return name;
    }
    public boolean getcelldoor(){
        return celldoor;
    }
    public void setdoor(int seruritycodein){
        if(!(seruritycodein==seruritycode)){
            System.out.println("wrong code");
        }
        else{
            if(celldoor==false){
                celldoor=true;
            }
            else{
                celldoor = false;
            }
        }
    }
}