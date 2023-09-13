public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.com";
        int countw = 0;
        int max = str.length();
        for(int i = 0;i<max; i++){
            if (str.charAt(i) != 'w'){
                continue;
            }
            countw++;
        }
        System.out.println("Counting w : " + countw );
    }
}
    

