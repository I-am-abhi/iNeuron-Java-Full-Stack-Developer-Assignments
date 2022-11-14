import java.util.Scanner;

public class CheckPangramOrNot {
    private static boolean checkPangram(String str){
        boolean[] check = new boolean[26];
        str = str.toLowerCase();
        int index = 0;
        for(int i = 0 ; i <str.length();i++ ){
            if('a' <= str.charAt(i) && str.charAt(i)<='z'){
                 index = str.charAt(i)-'a';
                 check[index] = true;
            }
        }
        for(int i = 0 ; i<=25 ;i++){
            if(check[i] == false) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String :");
        String input1 = scn.nextLine();
        System.out.println();
        if(checkPangram(input1))System.out.println("The String : "+input1+" is a Pangram ");
        else System.out.println("The String :"+input1+" is not a Pangram ");
        scn.close();
    }
}
