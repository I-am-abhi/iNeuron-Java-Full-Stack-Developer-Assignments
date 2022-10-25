
public class Question4Solution {
    public static void main(String[] args) {
        int rows = 8;
        for (int i=1; i<=rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = i*2; k <= rows*2-1; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
