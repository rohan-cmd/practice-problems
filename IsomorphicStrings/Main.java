package IsomorphicStrings;

import java.util.*;
 
class Main
{
    public static boolean isIsomorphic(String X, String Y)
    {
        if (X == null || Y == null) {
            return false;
        }
 
        if (X.length() != Y.length()) {
            return false;
        }
 
        Map<Character, Character> map = new HashMap<>();
 
        Set<Character> set = new HashSet<>();
 
        for (int i = 0; i < X.length(); i++)
        {
            char x = X.charAt(i), y = Y.charAt(i);
 
            if (map.containsKey(x))
            {

                if (map.get(x) != y) {
                    return false;
                }
            }
 
            else {
                if (set.contains(y)) {
                    return false;
                }
 
                map.put(x, y);
                set.add(y);
            }
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
        
        String X = "ACAB";
        String Y = "XCXY";
 
        if (isIsomorphic(X, Y)) {
            System.out.println(X + " and " + Y + " are Isomorphic");
        }
        else {
            System.out.println(X + " and " + Y + " are not Isomorphic");
        }
    }
}
