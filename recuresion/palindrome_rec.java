import java.util.Scanner;


public class palindrome_rec {
	
	public static boolean isPalindrome(String str) {
		
		if(str.length()<=1){
			return true;
		}
		
		int endIndex = str.length()-1;
		
		if(str.charAt(0)==str.charAt(endIndex))
		{
			return isPalindrome(str.substring(1, endIndex));
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		boolean answer = isPalindrome(str);
		System.out.println(answer);
		
		
	}

}
