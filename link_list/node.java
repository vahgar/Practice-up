
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
	
	public static node delEl(int data, node head)
	{
		node temp = head;
		while(temp!=null)
		{
			if(temp.next.data == data)
			{
				temp.next = temp.next.next;
				return head;
			}
			temp = temp.next;
		}
		return head;
	}
}
