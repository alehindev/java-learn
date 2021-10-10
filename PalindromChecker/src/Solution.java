import java.util.Locale;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isPalindrome("1x2"));

    }
    static boolean isPalindrome(String text){
        String newString = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb_newString = new StringBuilder(newString);
        boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
        return fin;
    }
}