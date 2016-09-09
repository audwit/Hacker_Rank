package LinkedList;

public class DeleteNode
{
	Node Delete(Node head, int position) 
	{
		//Find out the size of the linked list
				int size=0;
				{
					Node temp = head;
					while(temp.next !=null)
					{
						temp = temp.next;
						size++;
					}
				}
		Node temp = head;
		//Delete node from empty linked list
		if(head == null) // Do Nothing
		{
			return head; 
		}
		
		//Delete 0th index
		else if(position == 0)
		{
			head = temp.next;
		}
		// Delete (n-1)th index
		else if(position <= size-1)
		{
			for(int i=0; i<position-1 ;i++ )
			{
				temp =temp.next;
			}
			temp.next = temp.next.next;
		}
		//Delete last node
		else if(position == size)
		{
			for(int i=0; i<size-1;i++)
			{
				temp = temp.next;
			}
			temp.next=null;
		}
		return head;
	}
	public static void main(String[] args)
	{
		Node node1 = new Node();
		Node head = node1;
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		node1.data = 10;
		node1.next = node2; 
		node2.data = 15;
		node2.next =node3;
		node3.data = 20;
		node3.next = node4;
		node4.data = 30;
		node4.next = null;
		DeleteNode dn = new DeleteNode();
		head = dn.Delete(head,3);
		
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
	}

}
