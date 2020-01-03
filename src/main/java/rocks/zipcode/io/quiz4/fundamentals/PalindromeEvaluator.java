package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                String subStr = string.substring(i, j);
                if(isPalindrome(subStr)){
                    palindromes.add(subStr);
                }
            }
        }
        if(isPalindrome(string)){
            palindromes.add(string);
        }
        return palindromes.toArray(new String[palindromes.size()]);
    }

    public static Boolean isPalindrome(String string) {
        String rev = "";
        for (int i = string.length()-1; i >= 0; i--){
            rev+= string.charAt(i);
        }
        return string.equals(rev);
    }

    public static String reverseString(String string) {

        String rev = "";
         for (int i = string.length()-1; i >= 0; i--){
             rev+= string.charAt(i);
         }
        return rev;
    }
}
