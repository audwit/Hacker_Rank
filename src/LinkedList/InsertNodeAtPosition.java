package LinkedList;

public class InsertNodeAtPosition
{
	public Node InsertNth(Node head, int data, int position) 
	{
		if(head != null) // if there is data in the linked list
		{
			Node temp =head;
			for(int i=0;i>position; i++) // find the position and make temp point it
			{
				temp=temp.next;
			}
			Node node = new Node();
			node.data = data;
			node.next = temp.next;
			temp.next = node;
		}
		else  //if the linked list is empty
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
		node1.data = 10;
		node1.next = node2; 
		node2.data = 15;
		node2.next =null;
		
		InsertNodeAtPosition insert = new InsertNodeAtPosition();
		insert.InsertNth(head, 30, 0);
		
		//Print the list
		Node temp = head;
		while(temp.next != null)
		{
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
	}

}
