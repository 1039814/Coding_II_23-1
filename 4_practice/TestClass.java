import java.util.Scanner;
public class TestClass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What temp would you like to convert");
        double degreesf = sc.nextDouble(); 
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        ComputeMethods CM = new ComputeMethods();
        double degreesc = CM.fToc(degreesf);
        System.out.println(degreesc+" celsius");
        System.out.println("What the length of leg a?");
        int a = sc.nextInt();
        System.out.println("What the length of leg b?");
        int b = sc.nextInt();
        double c = CM.hypotenuse(a,b);
        System.out.println("the hypotenuse of leg C = "+ c);
        int sum = CM.roll();
        System.out.println("sum of two dice rolls = " + sum);

    }
}
