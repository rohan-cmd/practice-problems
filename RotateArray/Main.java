package RotateArray;

import java.util.*;
public class Main {
        public static void rotate(int[] nums, int k) {
            // ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
            // for(int i : nums){
            //     adq.offer(i);
            // }
            // for(int i=0; i<k; i++){
            //     adq.offerFirst(adq.pollLast());
            // }
            // int j = 0;
            // for(int i : adq){
            //     nums[j]=i;
            //     j++;
            // }
            int x = k;
            int[] arr = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                if(x==nums.length){
                    x=0;
                }
                arr[x] = nums[i];
                x++;
            }
            for(int i=0; i<arr.length; i++){
                nums[i]=arr[i];
            }
        }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        for(int i : nums){
            System.out.print(i + " -> ");
        }
    }
}
