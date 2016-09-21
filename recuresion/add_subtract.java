
public class add_subtract {
	
	public static int multiply(int a, int b) {
		
		if(b<1)
		{
			return 0;
		}
		
		int result = a + multiply(a,b-1);
		return result;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = multiply(25,100);
		System.out.println(x);
	}

}
