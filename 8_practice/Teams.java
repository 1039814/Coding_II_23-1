import java.util.ArrayList;
import java.util.Scanner;
public class Teams {
    private static int teams = 0; 
    private String name;
    private int wintotal;
    private int losstotal;
    private int tie_total;
    private int goalstotal;
    private int goalsallowed;
    ArrayList<Teams> team = new ArrayList<>();
    public Teams(String name, int wintotal, int losstotal, int tie_total, int goalstotal, int goalsallowed) {
        this.name = name;
        this.wintotal = wintotal;
        this.losstotal = losstotal;
        this.tie_total = tie_total;
        this.goalstotal = goalstotal;
        this.goalsallowed = goalsallowed;
        teams++;
        team.add(teams, this);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWintotal() {
        return wintotal;
    }
    public void setWintotal(int wintotal) {
        this.wintotal = wintotal;
    }
    public int getLosstotal() {
        return losstotal;
    }
    public void setLosstotal(int losstotal) {
        this.losstotal = losstotal;
    }
    public int getTie_total() {
        return tie_total;
    }
    public void setTie_total(int tie_total) {
        this.tie_total = tie_total;
    }
    public int getGoalstotal() {
        return goalstotal;
    }
    public void setGoalstotal(int goalstotal) {
        this.goalstotal = goalstotal;
    }
    public int getGoalsallowed() {
        return goalsallowed;
    }
    public void setGoalsallowed(int goalsallowed) {
        this.goalsallowed = goalsallowed;
    }

}
