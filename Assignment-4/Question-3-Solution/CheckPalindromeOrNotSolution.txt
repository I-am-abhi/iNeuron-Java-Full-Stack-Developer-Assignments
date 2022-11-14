
import java.util.Scanner;

public class CheckPalindromeOrNot {
    public static boolean checkPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String :");
        System.out.println();
        String str = scn.next();

        if (checkPalindrome(str) == true)
            System.out.println("Yes the input " + str + " is Palindrome");
        else
            System.out.println("No the input " + str + " is Not Palindrome");
        scn.close();
    }
}
