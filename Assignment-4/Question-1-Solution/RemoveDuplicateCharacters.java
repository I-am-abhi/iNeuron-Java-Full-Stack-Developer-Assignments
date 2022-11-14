import java.util.Scanner;

class RemoveDuplicateCharacters{
    private static void removeDuplicateCharacters(String input){
        String result = ""+input.charAt(0);
        for(int i = 1 ; i< input.length();i++){
            if(!result.contains(String.valueOf(input.charAt(i))))
            result = result+input.charAt(i);
        }
        System.out.println("The String after removing duplicate characters is : "+ result);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the String :");
        String str = scn.next();
        System.out.println();
        System.out.println("The initial String is :" + str);
        System.out.println();
        removeDuplicateCharacters(str);
        scn.close();
    }
}