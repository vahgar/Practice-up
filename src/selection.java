import java.util.Scanner;


public class selection {
	
	public static void selection_sort(int[] array) {
		int chosen_index = 0;
		int dummy_space = 0;
		
		for(int j=0;j<array.length-1;j++)
		{
			int chosen_one = array[j];
			for (int i=j;i<array.length;i++)
			{
				if(chosen_one>=array[i])
				{
					chosen_one=array[i];
					chosen_index = i;
					
				}
				
				
			}
			dummy_space = array[j];
			array[j] = array[chosen_index];
			array[chosen_index] = dummy_space;
			

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
		
		selection_sort(array_1);
		
		for(int i=0;i<array_1.length;i++)
		{
			System.out.println(array_1[i]);
		}
		
	}

}
