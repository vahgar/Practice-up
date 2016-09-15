import java.util.ArrayList;
import java.util.Scanner;

public class push_zeros {
	
	public static void pushZero(int[] array)
	{
		ArrayList<Integer> new_array = new ArrayList<Integer>();
		
		
		for(int i=0; i<array.length; i++)
		{
			new_array.add(array[i]);
		}
		int count =0;
		int length = new_array.size();
		for(int i=0;i<length;i++)
		{
			if(new_array.get(i)==0)
			{
				new_array.add(0);
				count++;
			}
		}
		int number =0;
		for(int i=0; i<=count;i++)
		{
			if(new_array.get(i-number)==0)
			{
				new_array.remove(i-number);
				number++;

			}
		}
		
		for(int i=0;i<new_array.size();i++)
		{
			System.out.println(new_array.get(i));
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
		
		pushZero(array_1);
		
		
	}

}
