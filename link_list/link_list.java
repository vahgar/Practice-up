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
	
	public static void delEl(int data, node head) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node head = takeInput();
		printLL(head);
		head.nextEl(3, head);
	
	}

}
