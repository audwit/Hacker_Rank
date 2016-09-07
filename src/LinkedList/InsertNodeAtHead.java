package LinkedList;

public class InsertNodeAtHead
{

	public Node insertAtHead(Node head,int data) 
	{
		if(head != null) // if there is data in the linked list
		{
			Node node = new Node();
			node.data = data;
			node.next = head;
			head = node;
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
		
		InsertNodeAtHead nh = new InsertNodeAtHead();
		nh.insertAtHead(head, 40);
		System.out.println(head.data);
	}

}
