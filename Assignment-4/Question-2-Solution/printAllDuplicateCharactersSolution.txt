import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class printAllDuplicateCharacters {

    public static void printAllDuplicateCharactersUsingHashMap(char[] input){
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : input){
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the String :");
        String str = scn.next();
        char[] input = str.toCharArray();
        System.out.println();
        System.out.println("The initial String is :" + str);
        System.out.println();
        System.out.println("The String after removing duplicate arrays :");
        printAllDuplicateCharactersUsingHashMap(input);
        scn.close();
    }
}
