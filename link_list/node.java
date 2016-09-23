
public class node {
	
	int data;
	node next;
	
	public static void nextEl(int data, node head)
	{
		node temp = head;
		while(temp!=null)
		{
			if(temp.data == data && temp.next != null)
			{
				System.out.print("Next Element is " + temp.next.data);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Either " +data+ " does not exist or no next element ");
	}
	
	
}
