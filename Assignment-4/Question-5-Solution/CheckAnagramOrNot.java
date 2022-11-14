import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramOrNot {
    private static boolean checkAnagram(String input1,String input2){
        char[] arr1 = input1.toCharArray();
        char[] arr2 = input2.toCharArray();
        if(arr1.length != arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0 ; i < arr1.length ; i++) if (arr1[i] != arr2[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st String :");
        String input1 = scn.next();
        System.out.println();
        System.out.print("Enter 2nd String :");
        String input2 = scn.next();
        System.out.println();
        if(checkAnagram(input1,input2))System.out.println("The String : "+input1+" and "+input2+" are Anagram to each other ");
        else System.out.println("The String :"+input1+" and "+input2+" are not Anagram to each other ");
        scn.close();
    }
}
