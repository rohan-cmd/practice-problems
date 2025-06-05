package FirstNonRepeatingCharacter;

import java.util.*;


public class Main {
    
    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    static Character firstNonRepeatingChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return null;
    }
    /////////////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
        
    }
    
}

