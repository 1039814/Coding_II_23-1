package StringProject;

public class StringProject {
    private String myString;
    public StringProject (String str) {
        myString = str;
    }
    public String toString() {
        return myString;
    }
    public String reverseCase(){
        String backwordsstr = "";
        String tempString;
        for(int i = 0; i<myString.length();i++){
            tempString = myString.substring(i, i+1);
            if (tempString.equals(tempString.toLowerCase())){
                tempString=tempString.toUpperCase();
                backwordsstr+=tempString;

            }
            else {
                tempString=tempString.toLowerCase();
                backwordsstr+=tempString;
            }
        }
        return backwordsstr;
    }
    public int characterCount(String a){
        int num=0;
        String tempString;
        for(int i=0;i<myString.length();i++){ 
        tempString = myString.substring(i, i+1);
        if (tempString.equals(a)){
            num++;
        }
        }
        return num;
    }
    public String reverseString(){
        String reversedStr = "";
        String tempString;
        for (int i = myString.length(); i > 0; i--){
            tempString = myString.substring(i-1, i);
            reversedStr += tempString;
        }
        return reversedStr;
    }
    public String eachWordOnALine(){
        String ewoalstr = "";
        String tempString;
        for (int i = 0; i<myString.length();i++){
           tempString = myString.substring(i, i+1);
           if(tempString.equals(" ")) {
               tempString = "\n"; 
           }
           ewoalstr += tempString;
        }
        return ewoalstr; 
    }
    public int wordCount(){
        int wordC = 1;
        String tempString;
        for(int i=0;i<myString.length();i++){
            tempString = myString.substring(i, i+1);
            if(tempString.equals(" ")) {
                wordC++;
            }
        }
        return wordC;
    }
    public int characterCount(){
        int cC =0;
        String tempString;
        for(int i=0;i<myString.length();i++){
            tempString = myString.substring(i, i+1);
            if(!tempString.equals(" ")) {
                cC++;
            }
        }
        return cC;
    }
    public double avgWordLength(){
        int Numberofwords = 1;
        double NCIW = 0;
        double avg = 0;
        String tempString;
        for(int i=0;i<myString.length();i++){
            tempString = myString.substring(i, i+1);
            if (!tempString.equals(" ")){
                NCIW++;
            }
            else{
                Numberofwords++;
            }
        avg = NCIW/Numberofwords;
        }
        return avg;
    }
    public int vowelCount(){
        int numv = 0;
        String tempString;
        for(int i =0;i<myString.length();i++ ){
            tempString = myString.substring(i, i+1);
            if(vowel(tempString)){
                numv++;
            }
        }   
        return numv;
    }
    public boolean vowel(String in){
        boolean vowel = false;
        if(in.equalsIgnoreCase("a")||in.equals("e")||in.equals("i")||in.equals("o")||in.equals("u")){
            vowel=true;
        }
        return vowel;
    }
    public boolean isPalindrome(){
        String tempmyString = "";
        char tempString3;
        String tempString1 = "";
        String tempString2 = "";
        for(int i =0;i <myString.length(); i++){
            tempString3 = myString.charAt(i);
            if(Character.isLetter(tempString3)){
                tempmyString += tempString3;
            }
        }
        for(int i =0; i < (tempmyString.length()/2);i++){
            tempString1 = tempmyString.substring(i,i+1);
            tempString2 = tempmyString.substring(tempmyString.length()-i-1,tempmyString.length()-i);
            if(!tempString1.equalsIgnoreCase(tempString2)){
                return false;
            }
        }
        return true;
    }
}