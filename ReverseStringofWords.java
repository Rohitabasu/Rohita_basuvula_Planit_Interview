import java.util.Scanner;

public class ReverseStringofWords {
 
    public static void reverseEachWord(String str) {
    	
    	String reverseWord = str.replaceAll(" ", "-");
    	StringBuilder sbr = new StringBuilder(reverseWord);
    	System.out.println(sbr.reverse());
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string sentence with spaces::");
		String inputVal = sc.nextLine();
		
		reverseEachWord(inputVal);
	}
}
