package NumberToWords;
public class Main
{
    public static String numb(int x){
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String dig=Integer.toString(x);
        StringBuilder str = new StringBuilder();
        for(int i=0; i<dig.length(); i++){
            char y = dig.charAt(i);
            int z=y-'0';
            str.append(arr[z]);
        }
        return str.toString();
    }
	public static void main(String[] args) {
	    int num = 123;
	    String result=numb(num);
		System.out.println("Output : " + result);
	}
}
