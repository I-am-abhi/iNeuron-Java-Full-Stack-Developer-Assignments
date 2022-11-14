import java.util.Scanner;

public class FindMaximumOccurringCharacter {
    static final int ASCII_SIZE = 256;
    private static void findMaximumOccurringChar(String str){
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for(int i = 0 ; i < len ; i++) count[str.charAt(i)]++;
        int max = -1;
        int result_idx = 0;
        char result=' ';
        for(int i = 0 ; i < len ; i++){
            if(max < count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result = str.charAt(i);
                result_idx = i;
            }
        }
        System.out.println("The maximum occurring character is :"+result +" which occurs "+count[str.charAt(result_idx)]+" times");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String :");
        String input1 = scn.next();
        System.out.println();
        findMaximumOccurringChar(input1);
        scn.close();
    }
}
