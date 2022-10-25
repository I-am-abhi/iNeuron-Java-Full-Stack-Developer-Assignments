
public class Question3Solution {
    public static void main(String[] args) {
        

        int rows = 7;
        
        
        
        for (int i=1; i<=rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = i; l <= rows; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int n = 7;
      
      for(int i=0;i<n;i++)
      {
          
          for(int j=0;j<n;j++)
          {
              
              if(j==0|| i==n-1 || j==n-1)
              {
              System.out.print("*");
              }
              if( i==n-1)
              {
              System.out.print("*");
              }
              
              else
              System.out.print("  ");
          }
          System.out.println();
      }
    }
}
