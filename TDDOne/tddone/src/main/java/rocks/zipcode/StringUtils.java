package rocks.zipcode;
/** 
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            r = r + str.charAt(i);
        }
        return r;
    }
    
    public static int countOccurrences(String str, char c) {
        // Your implementation here
        int x = 0;
        for (int i=0; i < str.length(); i++)
            if (str.charAt(i) == c) {
                x++;
            }
        return x;
    }
    
    public static boolean isPalindrome(String str) {
        // Your implementation here
        // Note: Ignoring case and non-alphanumeric characters
        String cleanstr = str.replaceAll("[^a-zA-Z0-9]", "");
        String cleanerstr = cleanstr.replaceAll(" ", "");

        //Once removed things can run below.
            if (cleanerstr.equals(new StringBuilder(cleanerstr).reverse()).toString()){
                return false;
            }
        else{
                return true;
            }
        }
    }
}

