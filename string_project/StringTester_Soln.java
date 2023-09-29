/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DSlater
 */
public class StringTester_Soln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringProject_Soln stats = new StringProject_Soln("This land is your land.");
        System.out.println("Current string: " + stats);
        System.out.println("Current String with reversed case: " + stats.reverseCase());
        System.out.println("Times 'a' appears in the string: " + stats.characterCount("a"));
        System.out.println("String reversed: " + stats.reverseString());
        System.out.println("Each word on a separate line: \n" + stats.eachWordOnALine());
        System.out.println("Number of words in the String: " + stats.wordCount());
        System.out.println("Number of characters in the String: " + stats.characterCount());
        System.out.println("Average word length in the String: " + stats.avgWordLength());
        System.out.println("Number of vowels in the String: " + stats.vowelCount());
        System.out.println("Number of times that the substring 's' occurs in the String: " + stats.substrCount("s"));
        System.out.println("Your string: " + stats + "\n Is it a Palindrome?: " + stats.isPalindrome());
        System.out.println("");
        
        StringProject_Soln stats2 = new StringProject_Soln("Was it a car or a cat I saw?");
        System.out.println("Your new string: " + stats2);
        System.out.println("Your new string: " + stats2 + "\n Is it a Palindrome?: " + stats2.isPalindrome());
    }
}
