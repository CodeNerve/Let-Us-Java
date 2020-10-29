public class myqueue {
	class Node{
		int data;
		Node next;
		Node(int data) 
		{
			this.data=data;
			Node next=null;
			
		}
	}
	Node head,rear;
	 public void enqueue(int add)
	 {
		 Node toadd =new Node(add);
		 if(head==null)
		 {
			 head=rear=toadd;
			 return;
		 }
		 rear.next=toadd;
		 rear=rear.next;
		 
	 }
	 public int dequeue(){
		 if(head==null) {
			 return (Integer) null;
		 }
		 Node temp=head;
		 head=temp.next;
		 
		 if(head==null) {
			 rear=null;
		 }
		 return temp.data;
	 }
	 public static void main()
	 {
		 myqueue q=new myqueue();
		 
		 q.enqueue(1);
		 q.enqueue(2);
		 q.enqueue(3);
		 q.enqueue(4);
		 q.enqueue(5);
		 // a=q.dequeue();
		 //q.dequeue();
		// q.dequeue();
		 System.out.println(q.dequeue());
	 }
	 

}
