
public class LoopShape {
    
    static void createRectangle(int width, int height){
        if(width<1||height<1){
            System.out.println("unalbe to draw shape less than one");
        }
        //Draw a Rectangle
        //first row
        for(int i =0;i<(width-1);i++){
            System.out.print("*");
        }
        //middle rows
         System.out.print("*\n");
        for(int i =0;i< height-2; i++){
            //inbetween *s
            System.out.print("*");
                for(int i2 =0;i2< width-2; i2++){
                    System.out.print(" ");
            }
            System.out.print("*\n");
        }
        //last row
        if(height<1){
        for(int i =0;i<width-1;i++){
            System.out.print("*");
        }
         System.out.println("*\n");
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        System.out.print("*\n");//first line
        for(int i =2;i<= (leg-1); i++ ){
            System.out.print("*");//first line
            for(int i2 =0;i2<i-2; i2++){//calutlate spaces
            System.out.print(" ");
            }
            System.out.print("*\n");//second line
        }
        if(leg<1){
        for(int i =1;i<= (leg); i++ ){
            System.out.print("*");
        }
        }
    }

}
