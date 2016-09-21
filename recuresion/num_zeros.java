
public class num_zeros {
	
	public static int num_zero(int num) {
		if(num/10 == 0)
		{
			return 0;
		}
		int count = 0;
		int x = num%10;
		
		if(x == 0) {
			count++;
		}
		num = num/10;
		count = count + num_zero(num);
		return count;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = num_zero(1030004);
		System.out.print(y);

	}

}
