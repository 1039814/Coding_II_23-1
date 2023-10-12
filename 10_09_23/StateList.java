
import java.util.ArrayList;
public class StateList {
    private final ArrayList<State> list;
    public StateList()
    {
        list = new ArrayList<>();
    }
    public void addState(State a){
        list.add(a);
    }
    public String findMax(){
        if (list.isEmpty()){
            return null;
        }
        State largest = list.get(0);
        for(int i = 1; i < list.size(); i++){
            State a = list.get(i);
            if(a.getPopulation() > largest.getPopulation())
            largest = a;
        }
        return "The state with the largest population is State id: " +
        largest.getStateid() + "\nThe population is " +
        largest.getPopulation();
        }
    public class StatesProject {
        public static void main(String[] args) {
            StateList list = new StateList();
            list.addState(new State(1, 200));
            list.addState(new State(2, 300));
            list.addState(new State(3, 400));
            System.out.println(list.findMax());
        }    
    }
    public String Findmin(){
        if (list.isEmpty()){
            return null;
        }
        State smallest = list.get(0);
        for(int i = 1; i < list.size(); i++){
            State a = list.get(i);
            if(a.getPopulation() < smallest.getPopulation())
            smallest = a;
        }
        return "The state with the smallest population is State id: " +
        smallest.getStateid() + "\nThe population is " +
        smallest.getPopulation();
        }
    }
