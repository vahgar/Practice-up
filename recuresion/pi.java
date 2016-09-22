import java.util.Scanner;


public class pi {
	
	public static String add_pi(String str) {
		String pi = "pi";
		if (!str.contains(pi)){
			return str;
		}
		else {
			int y = str.indexOf(pi);
			str = str.substring(0, y) + "3.14" + str.substring(y+2,str.length());
			return add_pi(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		String x =add_pi(str);
		System.out.println(x);

	}

}
