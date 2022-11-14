import java.util.HashSet;
import java.util.Scanner;

public class CheckStringUniquenessUsingHashSet {
    private static boolean checkStringUniqueness(String str){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < str.length();i++){
            set.add(str.charAt(i));
        }
        return set.size() == str.length();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String :");
        String input1 = scn.next();
        System.out.println();
        if(checkStringUniqueness(input1))System.out.println("The String : "+input1+" has all unique characters ");
        else System.out.println("The String :"+input1+" has duplicate characters ");
        scn.close();
    }
}
