import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a color code");
        int wavelength = sc.nextInt();
        if(wavelength <450|| wavelength >749){
              System.out.println("not wothin visible spectrum");
        }
        else if (wavelength > 380){
            System.out.println("the color is violet");
        } 
        else if (wavelength >= 450){
            System.out.println("the color is blue");
        }
        else if (wavelength >= 495){
            System.out.println("the color is green");
        }
        else if (wavelength >= 570){
            System.out.println("the color is yellow");
        }
        else if (wavelength >= 590){
            System.out.println("the color is orange");
        }
        else if (wavelength >= 620){
            System.out.println("the color is red");
        }
        sc.close();
        }
    }
