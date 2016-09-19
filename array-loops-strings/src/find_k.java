import java.util.Scanner;


public class find_k {
	
	public static int find_dor(int[] arr)
	{
		for(int i=0;i<arr.length; i++)
		{
			if(i<arr.length-1 && arr[i]>arr[i+1])
			{
				return i+1;
			}
		}
		
		return 0;
		
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
		
		int k = find_dor(array_1);
		System.out.print(k);
	}

}
