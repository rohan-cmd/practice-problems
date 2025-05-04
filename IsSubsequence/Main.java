package IsSubsequence;

public class Main {
    public static boolean isSubsequence(String s, String t) {
        StringBuilder sub = new StringBuilder();
        int j = 0;
        for(int i=0; i<t.length() && j<s.length(); i++){
            if(t.charAt(i)==s.charAt(j)){
                sub.append(t.charAt(i));
                j++;
            }
        }
        return s.equals(sub.toString());
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
