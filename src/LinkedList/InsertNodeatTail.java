package LinkedList;

public class InsertNodeatTail
{
	public Node Insert(Node head,int data) 
	{
		if(head !=null)
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			Node insertedNode = new Node();
			insertedNode.data = data;
			temp.next = insertedNode;
			insertedNode.next = null;
		}
		return head;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Node node1 = new Node();
		Node node2 = new Node();
		node1.data = 10;
		node1.next = node2; 
		node2.data = 15;
		Node head = node1;
		
		InsertNodeatTail nt = new InsertNodeatTail();
		nt.Insert(head, 20);
	}

}
