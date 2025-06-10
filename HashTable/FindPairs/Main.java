package FindPairs;

import java.util.*;


public class Main {

    // WRITE FINDPAIRS METHOD HERE // 
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        // Add all elements from arr1 to the set
        for (int num : arr1) {
            set.add(num);
        }

        // Check for each element in arr2 if the complement exists in arr1
        for (int num : arr2) {
            int complement = target - num;
            if (set.contains(complement)) {
                result.add(new int[]{complement, num});
            }
        }

        return result;
    }
    /////////////////////////////////


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */
        
    }
    
}

    
