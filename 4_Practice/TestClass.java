public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        ComputeMethods cm = new ComputeMethods();
        System.out.println("Temp in celsius is " + cm.fToC(64.0));
        System.out.println("Hypotenuse is " + cm.hypotenuse(3, 4));
        System.out.println("The sum of the dice values is " + cm.roll());
    }
}
