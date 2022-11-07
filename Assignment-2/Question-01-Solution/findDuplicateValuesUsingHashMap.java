import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class findDuplicateValuesUsingHashMap {
    public static void printDuplicateElements(int[] nums){
        int count = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num : nums){
            if(map.containsKey(num))map.put(num,map.get(num)+1);
            else map.put(num, 1);
        }
        System.out.print("The Duplicate Values you have entered are : ");
        Set<Entry<Integer, Integer>> entry = map.entrySet();
        for(Entry<Integer,Integer> ent : entry){
            if(ent.getValue()>1){
                count++;
                System.out.print(ent.getKey()+" ");
        }
        }
        if(count == 0) System.out.print("None");

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
