package PairOfSum;

public class SUMPAIR {
    public static void sumPair(int[] arr, int target){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target) {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 1, 9};
        int target = 10;
        sumPair(arr, target);
    }
}
