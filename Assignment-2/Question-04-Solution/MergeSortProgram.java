
//Abhisekh notes
// average time complexity - O(n*log n)
//space complexity - O(n)
import java.util.Scanner;

public class MergeSortProgram {
    public static void conquerElements(int[] arr, int low, int mid, int high) {
        int mergedArr[] = new int[high - low + 1];
        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArr[x++] = arr[idx1++];
            } else {
                mergedArr[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid)
            mergedArr[x++] = arr[idx1++];
        while (idx2 <= high)
            mergedArr[x++] = arr[idx2++];
        for (int i = 0, j = low; i < mergedArr.length; i++, j++)
            arr[j] = mergedArr[i];
    }

    public static void divideElements(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        divideElements(arr, low, mid);
        divideElements(arr, mid + 1, high);
        conquerElements(arr, low, mid, high);
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
        divideElements(arr, 0, arrSize - 1);
        System.out.print("The Sorted Array using MergeSort is : ");
        printArray(arr);
        scn.close();
    }
}
