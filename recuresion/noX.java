import java.util.Scanner;


public class noX {
	
	public static String noneX(String str) 
	{
		if(!str.contains("x")){
			return str;
		}
		else {
			int y = str.indexOf("x");
			str = str.substring(0, y) + "" + str.substring(y+1,str.length());
			return noneX(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		String x =noneX(str);
		System.out.println(x);
	}

}
