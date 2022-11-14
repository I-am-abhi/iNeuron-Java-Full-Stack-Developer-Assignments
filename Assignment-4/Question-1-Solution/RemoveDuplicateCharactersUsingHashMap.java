import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicateCharactersUsingHashMap {

    private static char[] removeDuplicateCharactersUsingHashMap(char []s){
        Map<Character ,Integer> contains = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < s.length ;i++){
            if(!contains.containsKey(s[i])){
                result.append(s[i]);
                contains.put(s[i],1);
            }
        }
        return result.toString().toCharArray();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the String :");
        String str = scn.next();
        char[] input = str.toCharArray();
        System.out.println();
        System.out.println("The initial String is :" + str);
        System.out.println();
        System.out.print("The String after removing duplicate arrays :");
        System.out.println(removeDuplicateCharactersUsingHashMap(input));
        scn.close();
    }
}
