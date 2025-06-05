package GroupAnagrams;

import java.util.*;


public class Main {
    
    // WRITE GROUPANAGRAMS METHOD HERE // 
    static List<List<String>> groupAnagrams(String[] strings){
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strings.length; i++){
            char[] chArr = strings[i].toCharArray();
            Arrays.sort(chArr);
            String str = new String(chArr);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList());
            }
            map.get(str).add(strings[i]);
        }
        
        return new ArrayList(map.values());
    }
    /////////////////////////////////////
    

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */
        
    }
    
}
