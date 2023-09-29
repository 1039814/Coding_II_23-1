public class PrisonerTest {
    public static void main(String[] args){
        Prisoner bubba = new Prisoner();
        bubba.name = new String("Bubba");
        bubba.height = "6\'10\"";
        bubba.yearsSentenced = 4;

        Prisoner twitch = new Prisoner();
        twitch.name = new String("Bubba");
        twitch.height = "5\'8\"";
        twitch.yearsSentenced = 3;

        System.out.println(bubba.name == twitch.name);

        bubba.name = "Bubba";
        twitch.name = "Bubba";

        System.out.println(bubba.name == twitch.name);
    }
}
