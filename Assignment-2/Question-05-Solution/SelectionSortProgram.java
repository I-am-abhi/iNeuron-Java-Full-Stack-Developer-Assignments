
//Abhisekh notes
//Worst Case Time Complexity is: O(N2)
//Average Case Time Complexity is: O(N2)
//Best Case Time Complexity is: O(N2)
//Space Complexity: O(1)
import java.util.Scanner;

public class SelectionSortProgram {
    private static void selectionSortElements(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            System.out.print("During Sorting : ");
            printArray(arr);
        }
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
        selectionSortElements(arr);
        System.out.print("The Sorted Array using BubbleSort is : ");
        printArray(arr);
        scn.close();
    }
}
