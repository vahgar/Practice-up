import java.util.Scanner;

public class string_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String string = console.nextLine();
		String new_string = string.substring(0,1);
		for(int i=1;i<string.length();i++)
		{
			int length = new_string.length() - 1;
			if(string.charAt(i)==new_string.charAt(length))
			{
				continue;
			}
			else {
				new_string = new_string + string.charAt(i);
			}
		}

		System.out.println(new_string);
	}

}
