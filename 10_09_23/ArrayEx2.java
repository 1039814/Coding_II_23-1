public class ArrayEx2 {
    
    public static void main(String args[]) {
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        for ( String name: browsers){
            System.out.println(name);
        }
        System.out.print("size of array: " + browsers.length + "\n");
        
    }
    
}
