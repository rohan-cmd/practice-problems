package MajorityElements;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int majorityElement(int[] nums){
        // First Method
        int count1=1, count2=0, ind=0;
        for(int i=1; i<nums.length; i++){
            if(nums[ind]==nums[i]){
                count1++;
            }
            if(nums[ind]!=nums[i]){
                count1--;
            }
            if(count1==0){
                ind=i;
                count1=1;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[ind]==nums[i]){
                count2++;
            }
        }
        if(count2>(nums.length/2)){
            return nums[ind];
        }
        return -1;

        // Second Method
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int key : map.keySet()) {
        //     if (map.get(key)>(nums.length/2)) {
        //         return key;
        //     }
        // }

        // return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }

}
