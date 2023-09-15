public class LoopShape {
    
    static void createRectangle(int width, int height){
        if (width < 1 || height < 1){
            System.out.println("Unable to draw a rectangle of dimension less than 0.");
        } else {
            //Draw a Rectangle
            String rect = "";
            //First Row
            for (int i = 0; i < width; i++){
                rect += "#";
            }
            rect += "\n";
            //In-between Rows
            for (int i = 0; i < height - 2; i++){
                rect += "#";
                for (int j = 0; j < width - 2; j++){
                    rect += " ";
                }
                rect += "#\n";
            }
            //Final Row
            if (height > 1){
                for (int i = 0; i < width; i++){
                rect += "#";
            }
            }
            System.out.println(rect);
        }
    }
    
    static void createTriangle(int leg){
        if (leg < 1){
            System.out.println("Unable to draw a triangle of dimension less than 0.");
        } else {
            //Draw an Isosceles Right Triangle
            String trg = "";
            //First Row
            trg += "#\n";
            if (leg > 1){
                for (int i = 0; i < leg - 2; i++){
                    trg += "#";
                    for (int j = 0; j < i; j++){
                        trg += " ";
                    }
                    trg += "#\n";
                }
                for (int i = 0; i < leg; i++){
                    trg += "#";
                }
            } 
            System.out.println(trg);
        }
    }
}
