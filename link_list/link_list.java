import java.util.Scanner;
public class link_list {
	
	public static node takeInput() 
	{
		System.out.println("Enter The element");
		Scanner console = new Scanner(System.in);
		int new_element_data = console.nextInt();
		node head = null;
		node tail = null;
		
		while( new_element_data != -1)
		{
			node new_node = new node();
			new_node.data = new_element_data;
			if(head == null)
			{
				head = new_node;
				tail = new_node;
			}
			else {
				tail.next = new_node;
				tail = new_node;
			}
			System.out.println("Enter Next Elemnet");
			new_element_data = console.nextInt();
		
		}
		
		return head;
	}
	
	public static void printLL(node head)
	{
		node temp = head;
		while(temp!= null)
		{
			System.out.print(temp.data + "--->");
			temp = temp.next;
		}
		System.out.println();
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
			if(temp.data == data) {
				temp = temp.next;
				return temp;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static node insertEnd(int data, node head)
	{
		node temp = head;
		while(temp!=null)
		{
			if(temp.next==null)
			{
				node new_node = new node();
				new_node.data = data;
				temp.next = new_node;
				return head;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node head = takeInput();
//		printLL(head);
//		node new_head = delEl(5,head);
//		printLL(new_head);
		node abc = insertEnd(5,head);
		printLL(abc);
	
	}

}
