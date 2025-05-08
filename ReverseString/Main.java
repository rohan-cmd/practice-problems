package ReverseString;

public class Main {
    static void reverseString(char[] s) {
        int j = s.length-1;
        for(int i=0; i<j; i++){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char i : s){
            System.out.print(i + " -> ");
        }
    }
}