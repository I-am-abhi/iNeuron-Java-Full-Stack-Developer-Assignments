import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class findDuplicateValuesUsingHashSet {
    public static void printDuplicateElements(int[] arr){
        int count = 0;
        Set<Integer> arrSet = new HashSet<Integer>();
        System.out.print("The Duplicate Values you have entered are : ");
        for(int i = 0 ; i < arr.length ;i++){
            if(arrSet.contains(arr[i])){
                 count++;
                 System.out.print(arr[i]+" ");
            }
            else arrSet.add(arr[i]);
        }
        if(count == 0)System.out.print("none");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Define the size of the Array: ");
        int arrSize = scn.nextInt();
        System.out.println();
      
        int arr[] = new int[arrSize];
        for(int i = 0 ; i < arrSize ; i++){
        System.out.print("No."+i+" element :");
        arr[i] = scn.nextInt();
        System.out.println();
        }
        printDuplicateElements(arr);
        scn.close();
    }
    }

