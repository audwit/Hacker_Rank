package LinkedList;

public class InsertNodeAtPosition
{
	public Node InsertNth(Node head, int data, int position) 
	{
		//Find out the size of the linked List
		int size=0;
		if(head!=null)
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp =temp.next;
				size++;
			}
		}
		//Find out the size of the linked List
		if(head != null) // if there is data in the linked list
		{
			Node temp =head;
			if(position == 0) //if data needs to be inserted at oth index
			{
				Node node = new Node();
				node.data = data;
				node.next = temp;
				head = node;
			}
			else if(position>0 & position<=size) //If index is anything other than o or the last
			{
				for(int i=0;i<position-1; i++) // find the position and make temp point it
				{
					temp=temp.next;
				}
				Node node = new Node();
				node.data = data;
				node.next = temp.next;
				temp.next = node;
			}
			else if(position==size+1) // If data needs to be inserted at the end of the linked list
			{
				Node node = new Node();
				node.data = data;
				node.next = null;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = node;
			}
			else if(position>size+1)
			{
				System.out.println("Please chose an index between 0 to " + (size+1));
			}
		}
		else if(head == null) //if the linked list is empty
		{
			Node node = new Node();
			node.data = data;
			node.next = null;
			head = node;
		}
		return head; 
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Node node1 = new Node();
		Node head = node1;
		Node node2 = new Node();
		Node node3 = new Node();
		node1.data = 10;
		node1.next = node2; 
		node2.data = 15;
		node2.next =node3;
		node3.data = 20;
		node3.next = null;
		
		InsertNodeAtPosition insert = new InsertNodeAtPosition();
		head = insert.InsertNth(node1, 9, 3);
		
		//Print the list
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
	}

}
