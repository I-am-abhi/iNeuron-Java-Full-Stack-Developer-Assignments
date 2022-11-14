import java.util.Scanner;

public class CountNumberOfConsonantsVowelsSpecialCharsAndMore {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Line :");
        System.out.println();
        String str = scn.nextLine();
        int vowels = 0,
                consonants = 0,
                digits = 0,
                spaces = 0,
                symbols = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                ++vowels;
            else if (ch >= 'a' && ch <= 'z')
                ++consonants;
            else if (ch >= '0' && ch <= '9')
                ++digits;
            else if (ch == ' ')
                ++spaces;
            else
                ++symbols;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White Spaces: " + spaces);
        System.out.println("Symbols: " + symbols);
        scn.close();
    }
}
