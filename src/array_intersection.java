import java.util.ArrayList;
import java.util.Scanner;

public class array_intersection {

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
		
		System.out.println("Enter Size of array Two");
		int size_2 = console.nextInt();
		int [] array_2 = new int[size_2];
		
		System.out.println("Enter elements of array_2");
		for(int i=0; i<array_2.length; i++)
		{
			array_2[i] = console.nextInt();
		}
		
		ArrayList<Integer> new_array = new ArrayList<Integer>();
		
		for(int j=0; j<array_2.length; j++)
		{
			for(int i=0; i<array_1.length; i++)
			{
				if(array_1[i] == array_2[j] && !new_array.contains(array_1[i]))
				{
					new_array.add(array_1[i]);
					break;
				}
			}
		}
		
		if(new_array.size() == 0)
		{
			System.out.println("No Common Element");
		}
		
		for(int i=0;i<new_array.size();i++)
		{
			System.out.println(new_array.get(i));
		}
		
		

	}

}
