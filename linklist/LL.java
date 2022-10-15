public class LL
{
	Node head;
	class Node{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	//add-first
	void addFirst(String data){
		Node newNode=new Node(data);
		if (head==null)
		{
			head=newNode;
			return;

		}
		newNode.next=head;
		head=newNode;

	}
	//add last
	 void addLast(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;

		}
		Node currNode=head;
		while(currNode.next !=null)
		{
			currNode=currNode.next;
			
		}
		currNode.next=newNode;
	}
		 void printList() {
			if(head==null)
			{
				System.out.print("list is empty");
			}
			Node currNode=head;
			while(currNode !=null)
			{
				System.out.print(currNode.data + " ->");
				currNode=currNode.next;
			}
			System.out.print("NULL");

		}
		  void deleteFirst()
		  {
			  if(head==null)
			  {
				  System.out.print("The list is empty");
				  return;
			  }
			  head=head.next;
		  }
		  
		  void deleteLast()
		  {
			  if(head==null)
			  {
				  System.out.print("The list is empty");
				  return ;
			  }
			  if(head.next==null)
			  {
				  head=null;
				  return;
			  }
			  Node secondLast=head;
			  Node lastNode=head.next;
			  while(lastNode.next !=null)
			  {
				  lastNode=lastNode.next;
				  secondLast=secondLast.next;
			  }
			  secondLast.next=null;
		  }
		  public void reverse()
		  {
			  if(head==null || head.next==null)
			  {
				  return;
			  }
			  Node prevNode=head;
			  Node currNode=head.next;
			  while(currNode !=null)
			  {
				  Node nextNode=currNode.next;
				  currNode.next=prevNode;

				  //update
				prevNode=currNode;
				currNode=nextNode;


			  }
			  head.next=null;
			  head=prevNode;
		  }

	

	public static void main(String args[])
	{
		LL list=new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		System.out.println();
		list.addLast("list");
		list.addFirst("This");
		
		list.printList();
		list.deleteLast();
		System.out.println();

		list.printList();
		list.deleteFirst();
		list.printList();
		System.out.println();

		list.reverse();
		list.printList();
		System.out.println();

	}
}