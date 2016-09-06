package LinkedList;

public class PrintElements
{
	void Print(Node head) 
	{
	    Node temp = head;
	    if(temp !=null)
	    {
	    	while(temp != null)
	    	{
	            System.out.println(temp.data);
	            temp = temp.next; 
	        }
	        
	    }
	}
	public static void main(String[] args)
	{
		Node node1 = new Node();
		Node node2 = new Node();
		node1.data = 10;
		node1.next = node2; 
		node2.data = 15;
		
		PrintElements  pEle = new PrintElements();
		pEle.Print(node1);
	}

}
