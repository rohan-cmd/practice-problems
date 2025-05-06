package LongestCommorPrefix;

public class Main {
    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++){
            while(!(strs[i].startsWith(prefix))){
                prefix = prefix.replaceAll(".$","");
                if(prefix==""){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
