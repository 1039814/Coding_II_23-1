import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
    String name;
    Scanner sc = new Scanner(System.in);
    System.out.println("whats your name");
    name = sc.next();
    if ( name.equalsIgnoreCase("moe") ){
    System.out.println("you are the king of rock and roll");
    }
    else{
    System.out.println("you are not the king of rock and roll");
    }
    sc.close();
    }
}

