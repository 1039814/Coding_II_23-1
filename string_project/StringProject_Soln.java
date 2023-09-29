public class StringProject_Soln {
    
    private String myString;
    
    public StringProject_Soln (String str) {
        myString = str;
    }
    
    public String reverseCase() {
        
        String temp = "";
        
        for (int i = 0; i < myString.length(); i++) {
            
            String allCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String letter = myString.substring(i, i + 1);
            
            if (allCaps.contains(letter)) {
                letter = letter.toLowerCase();
            } else {
                letter = letter.toUpperCase();
            }
            
            temp += letter;
        }
        
        return temp;
    }
 
    public int characterCount (String character) {
        
        int count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            String myLetter = myString.substring(i, i + 1);
            if (myLetter.equalsIgnoreCase(character)) {
                count ++;
            }
        }
        
        return count;
    }
    
    public String reverseString() {
        String temp = "";
        for (int i = myString.length() - 1; i >= 0; i--) {
            String myLetter = myString.substring(i, i+ 1);
            temp += myLetter;
        }
        
        return temp;
    }
    
    public String eachWordOnALine() {
        String temp = "\t";
        int index = 0;
        while (myString.indexOf(" ", index) > 0) {
            int space = myString.indexOf(" ", index);
            String word = myString.substring(index, space);
            temp += word + "\n\t";
            index = (space + 1);
        }
        String word = myString.substring(index);
        temp += word + '\n';
        
        return temp;
    }
    
    public int wordCount() {
        int count = 0;
        int index = 0;
        while (myString.indexOf(" ", index) > 0) {
            int space = myString.indexOf(" ", index);
            String word = myString.substring(index, space);
            count++;
            index = (space + 1);
        }
        count++;
        
        return count;
    }
    
    public int characterCount() {
        
        int count = 0;
        int index = 0;
        while (myString.indexOf(" ", index) > 0) {
            int space = myString.indexOf(" ", index);
            String word = myString.substring(index, space);
            count += word.length();
            index = (space + 1);
        }
        count += myString.substring(index).length();
        
        return count;
    }
    
    public double avgWordLength() {
        return (double)characterCount() / wordCount();
    }
    
    public int vowelCount() {
        
        String temp = myString.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            
            String vowels = "aeiou";
            String letter = myString.substring(i, i + 1);
            
            if (vowels.contains(letter)) {
                count++;
            }
        }
        
        return count;
    }
    
    public int substrCount(String str) {
        if (! myString.contains(str)) {
            return 0;
        } else {
            int count = 0;
            int index = 0;
            while (index <= (myString.length() - str.length())) {
		String checkString = myString.substring(index, index + str.length());
		if (checkString.equalsIgnoreCase(str)) {
			count++;
		}
		index++;
            }
		
            return count;
        }  
    }
    
    public boolean isPalindrome() {
        String punctuation = " .,?!\"\';:";
        String temp = "";
        for (int i = 0; i < myString.length(); i++) {
            String letter = myString.substring(i, i + 1);
            if (! punctuation.contains(letter)) {
                temp += letter;
            }
        }

        String reversed = "";
        for (int j = temp.length() - 1; j >= 0; j--) {
            reversed += temp.substring(j, j+1);
        }

        return temp.equalsIgnoreCase(reversed);
    }
    
    public String toString() {
        return myString;
    }
}
