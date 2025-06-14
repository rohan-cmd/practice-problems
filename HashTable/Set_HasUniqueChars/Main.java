package Set_HasUniqueChars;

import java.util.HashSet;
import java.util.Set;


public class Main {

    // WRITE HASUNIQUECHARS METHOD HERE //
    public static boolean hasUniqueChars(String string){
        Set<Character> chSet = new HashSet<>();
        for(Character ch : string.toCharArray()){
            chSet.add(ch);
        }
        
        if(string.length()==chSet.size()) return true;
        
        return false;
    }
    //////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */
        
    }
    
}
