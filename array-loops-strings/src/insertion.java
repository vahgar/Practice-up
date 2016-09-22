import java.util.Scanner;


public class insertion {
	
	public static void insertion_sort(int[] array)
	{
		for(int j=0;j<array.length;j++)
		{
			int special_index = j;
			for(int i=j;i>=0;i--)
			{
				
				if(array[special_index]<array[i])
				{
					int space = array[special_index];
					array[special_index] = array[i];
					array[i] = space;
					special_index = special_index - 1;
				}
				
				
			}
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
		
		insertion_sort(array_1);
		
		for(int i=0;i<array_1.length;i++)
		{
			System.out.println(array_1[i]);
		}
	}

}
