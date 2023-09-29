
public class PrisonTest {
    public static void main(String[] args) {
        
        Prison bubba = new Prison();
        bubba.Name = "Bubba";
        bubba.Hieght= "6\'10";
        bubba.years = 4;

        Prison twitch = new Prison();
        twitch.Name = "Bubba";
        twitch.Hieght= "6\'10";
        twitch.years = 4;
        
        System.out.println(bubba==twitch);
    
    }
}
