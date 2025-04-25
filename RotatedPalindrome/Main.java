package RotatedPalindrome;
import java.util.*;

public class Main {
    public static boolean RPalindrome(String str){
        char[] myArr = str.toCharArray();
        int oddCount=0;
        int count=1;
        Arrays.sort(myArr);
        for(int i=0; i<myArr.length-1; i++){
           if(myArr[i]==myArr[i+1]){ 
                count+=1; 
           }else{
                if(count%2==0){
                    continue; 
                 }else{
                    oddCount+=1;
                 }
                count=1;
           }
        } 
        if (oddCount==0 || oddCount==1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(RPalindrome(str));
    }
}

