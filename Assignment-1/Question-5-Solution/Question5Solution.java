

public class Question5Solution {
    public static void main(String[] args) {
        int rows = 6;
        for(int i = 0 ; i<=(rows+1)*2;i++)System.out.print("*");
        System.out.println();
        for (int i=1; i<=rows; i++) 
        { 
            
            for (int k=rows; k>=i; k--)
            {
                System.out.print("*");
            }
            
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        for (int i=2; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i<=(rows+1)*2;i++)System.out.print("*");
        System.out.println();
    }
}
