package SinglyLinkedLists;

public class SinglyLinkedList {
	class  Node{
		int data;
		Node next;
		 Node(int data) {this.data=data;this.next=null;
		}
	}
	public Node head=null;
	void appendNode(int data) {
		Node newnode= new Node(data);
		if(head==null) {
			head=newnode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}temp.next=newnode;
		}	
	}
	void insertFrontNode(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		System.out.println(newnode.data+" is inserted at the head");
	}
	int length(Node head) {
		Node temp=head;
		if(isEmpty()) {
			int len=0;
			while(temp!=null) {
				temp=temp.next;len++;
							  }
						 return len; }else {
								System.out.println("Nothing to display");
								return 0;
							}
		}
	void searchNode(int data) {
		Node temp=head;
		int found=0;
			int count=0;
			while(temp!=null) {
				if(temp.data==data) {
					found=1;
					break;
				}
				temp=temp.next;
				count++;}
			if(found==1) {System.out.println("It is found at: " + count);}else {System.out.println("Nope it is not found, sorry");}
			}
	void display() {
		Node temp=head;
		if(isEmpty()) {
		while(temp!=null) {
			System.out.println(temp.data+" and it's pointer to next node "+temp.next);
			temp=temp.next;
						  }
					  }
		else {
			System.out.println("Nothing to display");
			}
	}
		
	boolean isEmpty(){
		if(head!=null) {return true;}else {return false;}
	}
	void deleteNode(int tobedeleted) {
		int initiateaction=0;
		if(isEmpty()) {
			Node temp=head;
			Node prev=null;
			while(temp!=null) {
				if(temp.data==tobedeleted && temp==head) {
					head=temp.next;
					
					System.out.println("Deleted head node "+temp.data);
					temp=null;	
					initiateaction=1;
					break;
				}
				if(temp.data==tobedeleted) {
				prev.next=temp.next;
				System.out.println("Your node "+temp.data+" is Deleted");
				temp=null;
				initiateaction=1;break;
				}
				prev=temp;
				temp=temp.next;
			}}
			if(initiateaction==1) {return;}
		else {System.out.println("Your node wasn't found");return;}
	}
public static void main(String[] args) {
	SinglyLinkedList a=new SinglyLinkedList();
	a.appendNode(5);
	a.appendNode(10);
	a.appendNode(15);
	a.appendNode(20);
	a.appendNode(25);
	a.appendNode(30);
	a.searchNode(15);
	System.out.println("It's length is:" + a.length(a.head));
	a.deleteNode(10);
	a.display();
	a.deleteNode(33);
	a.deleteNode(5);
	a.insertFrontNode(270);
	a.display();
}
}
/*
OUTPUT:
It is found at: 2
It's length is:6
Your node 10 is Deleted
5 and it's pointer to next node testing.SinglyLinkedList$Node@15db9742
15 and it's pointer to next node testing.SinglyLinkedList$Node@6d06d69c
20 and it's pointer to next node testing.SinglyLinkedList$Node@7852e922
25 and it's pointer to next node testing.SinglyLinkedList$Node@4e25154f
30 and it's pointer to next node null
Your node wasn't found
Deleted head node 5
270 is inserted at the head
270 and it's pointer to next node testing.SinglyLinkedList$Node@15db9742
15 and it's pointer to next node testing.SinglyLinkedList$Node@6d06d69c
20 and it's pointer to next node testing.SinglyLinkedList$Node@7852e922
25 and it's pointer to next node testing.SinglyLinkedList$Node@4e25154f
30 and it's pointer to next node null
*/