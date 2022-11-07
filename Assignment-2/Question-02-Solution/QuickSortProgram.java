//Abhisekh Notes :-
//Worst case in Quick Sort occurs when pivot is always the smallest or the largest element .
// Generally if the Array is already sorted in Ascending or descending order it gives the worst case time complexity i.e. O(n^2)
//Average case time complexity is O(n*log n)
//Space complexity is O(log n)
//We still use Quick Sort because it does not take any extra space(i.e. does not create any extra array to store elements)
//And we are okay with the worst case .

import java.util.Scanner;

public class QuickSortProgram {
    public static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSortElements(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSortElements(arr, low, pivot - 1);
            quickSortElements(arr, pivot + 1, high);
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
        quickSortElements(arr, 0, arrSize - 1);
        System.out.print("The Sorted Array using QuickSort is : ");
        printArray(arr);
        scn.close();
    }
}
