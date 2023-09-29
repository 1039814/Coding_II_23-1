public class StringProject {
    private String myString;

    public StringProject(String str){
        myString = str;
    }

    public String toString() {
        return myString;
    }

    public String reverseCase(){
        String newString = "";
        for (int i = 0; i < myString.length(); i++){
            char letter = myString.charAt(i);
            if (Character.isLowerCase(letter)){
                newString += Character.toUpperCase(letter);
            } else {
                newString += Character.toLowerCase(letter);
            }
        }
        return newString;
    }

    public int characterCount(String character){
        int count = 0;
        String str = myString;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public String reverseString(){
        String newString = "";
        for (int i = myString.length() - 1; i >= 0; i--){
            newString += myString.charAt(i);
        }
        return newString;
    }

    public String eachWordOnALine(){
        String str = myString;
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                newString += "\n";
            } else {
                newString += str.charAt(i);
            }
        }
        return newString + "\n";
    }

    public int wordCount(){
        String str = myString;
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }

    public int characterCount(){
        return myString.replaceAll(" ", "").length();
    }

    public double avgWordLength(){
        return characterCount() / (double) wordCount();
    }

    public int vowelCount(){
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < myString.length(); i++){
            for (int j = 0; j < vowels.length; j++){
                if (myString.charAt(i) == vowels[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public int substrCount(String str){
        int count = 0;
        int currentIdx = 0;
        while (currentIdx != -1){
            currentIdx = myString.indexOf(str, currentIdx + 1);
            if (currentIdx != -1){
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(){
        String str = "";
        for (int i = 0; i < myString.length(); i++){
            if (Character.isLetter(myString.charAt(i))){
                str += Character.toLowerCase(myString.charAt(i));
            }
        }
        for (int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt((str.length() - i) - 1)){
                return false;
            }
        }
        return true;
    }
}
