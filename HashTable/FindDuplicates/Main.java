package FindDuplicates;

import java.util.*;


public class Main {

    // WRITE THE FINDDUPLICATES METHOD HERE // 
    static List<Integer> findDuplicates(int[] nums){
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])!=null){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
            }else{
                map.put(nums[i], true);
            }
        }
        
        return list;
    }
    //////////////////////////////////////////
      

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
        
    }

}

