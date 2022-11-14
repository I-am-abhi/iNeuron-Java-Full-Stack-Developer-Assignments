import java.util.Scanner;

public class CheckStringUniqueness {

    private static boolean checkStringUniqueness(String str){
        for(int i = 0 ; i < str.length() ; i++)
            for(int j = i+1 ; j < str.length() ; j++)
                if((str.charAt(i) == str.charAt(j))) return false;
        return true;
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
