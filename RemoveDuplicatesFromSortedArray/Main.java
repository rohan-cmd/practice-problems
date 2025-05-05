package RemoveDuplicatesFromSortedArray;

public class Main {
    static int removeDuplicates(int[] nums) {
        int count = 1, j = 0;
        if (nums.length==0) return 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[j]){
                j = j+1;
                nums[j] = nums[i];
                count = count+1;
            }
        }
        return count;

        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(i<nums.length-1 && nums[i]==nums[i+1]){
        //            continue;
        //     }
        //     nums[count] = nums[i];
        //     count++;
        // }
        // return count;

    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates(nums);

        for(int i=0; i<count; i++){
            System.out.print(nums[i] + " -> ");
        }
    }
}
