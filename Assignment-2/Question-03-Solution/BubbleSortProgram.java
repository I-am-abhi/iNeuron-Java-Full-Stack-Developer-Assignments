//Abhisekh Notes:
//Time Complexity: O(N^2)
//Auxiliary Space: O(1) 
import java.util.Scanner;

public class BubbleSortProgram {

    private static void bubbleSortElements(int[] arr) {
        int temp = 0;
        int count = 0;
        boolean swapped = true;
        int size = arr.length;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < size-1; i++) {
                if(arr[i]>arr[i+1]){
                    swapped= true;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                count++;
            System.out.print(count+"-> During Sorting : ");
            printArray(arr);
            }
            size-=1;
        }
        System.out.println("Total steps required to sort:" + count);
    }

    private static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Define the size of the Array: ");
        int arrSize = scn.nextInt();
        System.out.println();

        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("No." + i + " element :");
            arr[i] = scn.nextInt();
            System.out.println();
        }
        System.out.print("The Unsorted Array is :");
        printArray(arr);
        bubbleSortElements(arr);
        System.out.print("The Sorted Array using BubbleSort is : ");
        printArray(arr);
        scn.close();
    }
}
