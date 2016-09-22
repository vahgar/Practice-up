import java.util.Scanner;


public class all_sub {
	
	public static void print_all(String str)
	{
		int size = str.length();
		for(int j=0; j<size;j++)
		{
			for(int i=j+1; i<=size;i++)
			{
				System.out.println(str.substring(j, i));
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		print_all(str);
		
	}

}
