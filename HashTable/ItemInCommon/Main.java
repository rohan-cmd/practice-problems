package ItemInCommon;
import java.util.HashMap;

// Array Time Complexity : O(n^2)
// HashMap Time Complexity : O(n)
public class Main {
    static boolean isCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> myMap = new HashMap<>();

        for(int i : arr1){
            myMap.put(i, true);
        }

        for(int j : arr2){
            if (myMap.get(j)!=null) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,5};

        System.out.println(isCommon(arr1, arr2));
    }
}
