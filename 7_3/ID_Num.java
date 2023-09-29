public class ID_Num {
    public String id;

    public ID_Num(){
        id = "##-###";
    }

    public ID_Num(String newId){
        id = newId;
    }

    public ID_Num(ID_Num obj){
        id = obj.getID();
    }

    public String getID(){
        return id;
    }

    public void setID(String newId){
        id = newId;
    }
}