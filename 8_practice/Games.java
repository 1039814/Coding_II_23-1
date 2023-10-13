import java.util.ArrayList;
import java.util.Random;
public class Games {
    Random rand = new Random();
    private static int gamenum = 0;
    ArrayList<Games> team = new ArrayList<>();
    public String playgame(ArrayList teams, int temp){
        gamenum++;
        int awayteamnum = rand.nextInt(0,teams.size());
        int hometeamnum = rand.nextInt(0,teams.size());  
        while (!(awayteamnum==hometeamnum)) {
           hometeamnum = rand.nextInt(0,teams.size());  
        }
        Teams awaayteam
        String game = "";
        game += "game # " + gamenum + "\n";
        game += "temperature: "+ temp + "\n";
        game += "away Team: " + 
        return game;
        
    }
    
}
