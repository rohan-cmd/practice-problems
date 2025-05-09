import java.util.Arrays;

public class Main {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = 0;
		for(int i=0; i<nums1.length; i++){
			if(nums1[i]==0 && c<nums2.length){
				nums1[i] = nums2[c];
				c++;
			}
		}
		Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for(int i : nums1){
            System.out.print(i + " -> ");
        }
    }   
}
