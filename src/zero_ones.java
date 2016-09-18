import java.util.Scanner;


public class zero_ones {
	public static void sort01(int[] arr) {
		int zeros = 0;
		int ones = 0; 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{	
				zeros++;
			}
			if(arr[i]==1)
			{
				ones++;
			}	
		}
		
		for (int i=0;i<zeros;i++)
		{
			arr[i] = 0;
		}
		for (int i=zeros;i<zeros+ones;i++)
		{
			arr[i] = 1;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Size of array one");
		int size_1 = console.nextInt();
		int [] array_1 = new int[size_1];
		
		System.out.println("Enter the elements of array_1");
		for(int i=0;i<array_1.length;i++)
		{
			array_1[i] = console.nextInt();
		}
		
		sort01(array_1);
		
		for(int i=0;i<array_1.length;i++)
		{
			System.out.println(array_1[i]);
		}

	}

}
