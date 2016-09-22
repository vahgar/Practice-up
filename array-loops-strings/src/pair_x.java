
public class pair_x {
	
	public static void check_array (int[] array, int x)
	{
		for(int i=0;i<array.length;i++) 
		{
			for(int j=0; j<array.length;j++)
			{
				if((array[i]+array[j])==x && i<j)
				{
					System.out.println("("+array[i]+", " +array[j]+")");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,2,3};
		int x = 6;
		check_array(array,x);

	}

}
