import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckSubsetArrayUsingSet {

    private static boolean isSubset(int[] arr1, int arrSize1, int[] arr2, int arrSize2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arrSize1; i++)
            set.add(arr1[i]);
        int firstSize = set.size();
        for (int i = 0; i < arrSize2; i++)
            set.add(arr2[i]);
        int lastSize = set.size();
        if (firstSize == lastSize)
            return true;
        else
            return false;
    }

    private static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Define the size of the Array1: ");
        int arrSize1 = scn.nextInt();
        System.out.println();
        int arr1[] = new int[arrSize1];
        for (int i = 0; i < arrSize1; i++) {
            System.out.print("No." + i + " element for Array1:");
            arr1[i] = scn.nextInt();
            System.out.println();
        }

        System.out.print("Define the size of the Array2: ");
        int arrSize2 = scn.nextInt();
        System.out.println();
        int arr2[] = new int[arrSize2];
        for (int i = 0; i < arrSize2; i++) {
            System.out.print("No." + i + " element for Array1:");
            arr2[i] = scn.nextInt();
            System.out.println();
        }

        System.out.print("Array1 elements are :");
        printArray(arr1);
        System.out.print("Array2 elements are :");
        printArray(arr2);

        if (isSubset(arr1, arrSize1, arr2, arrSize2))
            System.out.println(
                    "Array2 is a subset of Array1 ");
        else
            System.out.println(
                    "Array2 is not a subset of Array1 ");
        scn.close();
    }

}
