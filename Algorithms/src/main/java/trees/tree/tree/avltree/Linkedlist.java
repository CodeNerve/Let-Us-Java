package trees.tree.tree.avltree;

import java.util.Scanner;

class Node{
	public static Node head=null;
	int value;
	Node next;
	public void InsertAtFront(int val) {
		Node temp=new Node();
		temp.value=val;
		if(head==null)
			{
			temp.next=null;
			head=temp;
			}
		else {
			temp.next=head;
			head=temp;
		}
	}//end of insert at front function

	public void InsertAtEnd(int val) {
		Node temp=new Node();
		Node location=head;//location node will be last node(after the iteration) of the list if list is having at least one node
		temp.value=val;
		if(head==null)
		{
			temp.next=null;
			head=temp;
		}
	else {
		while(location.next!=null) {
			location=location.next;
		}
		location.next=temp;
		temp.next=null;
		}
	}//end of insert at end

	public void DeleteFromFront() {
		if(head==null) {
			System.out.println("list is empty nothing to delete");
		}
		else {
			System.out.println("first node of value "+head.value+" is deleted");
			head=head.next;
		}
	}//end of delete from front

	public void DeleteFromEnd() {
		Node location=head;
		if(head==null) {
			System.out.println("list is empty nothing to delete");
		}
		else if(head.next==null) {
			head=null;
		}
		else {
			while(location.next.next!=null) {

				location=location.next;
			}
			System.out.println("last node of value "+location.next.value+" is deleted");
			location.next=null;
			}
	}//end of delete from end function

	public void DeleteAnodeByValue(int val) {
			Node temp=head;
			if(head==null) {
				System.out.println("list is empty ");
			}
			else if(head.value==val) {
				System.out.println("delete operation is succesful");
			}
			else {
				while(temp.next!=null&&temp.next.value!=val) {
				temp=temp.next;
			}
			if(temp.next==null) {
				System.out.println(" a node of val "+val+" is not ptresent");
			}
			else {
				temp.next=temp.next.next;
			}
	}
	}//end of delete a node by value function
	public void Display() {
		Node temp=head;
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			do {
				System.out.print(temp.value+"->");
				temp=temp.next;
			}while(temp!=null);
			System.out.println("null");
		}
	}//end of display
}//end of Node class

public class Linkedlist {

	public static void main(String[] args) {
		Node list=new Node();
		int i;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("-------------------------------------");
		System.out.print("your list status:");
		list.Display();
		System.out.println("-------------------------------------");
		System.out.println("enter 1 for insert at front");
		System.out.println("enter 2 for insert at end");
		System.out.println("enter 3 for delete from front");
		System.out.println("enter 4 for delete from end");
		System.out.println("enter 5 for delete a node by value");
		System.out.println("enter 6 for exit");
		System.out.println("-------------------------------------");
		System.out.println("enter choice:");
		i=sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("enter num which u want to insert:");
			list.InsertAtFront(sc.nextInt());
			break;
		case 2:
			System.out.println("enter num which u want to insert:");
			list.InsertAtEnd(sc.nextInt());
			break;
		case 3:
			list.DeleteFromFront();
			break;
		case 4:
			list.DeleteFromEnd();
			break;
		case 5:
			System.out.println("enter value of a node which u want to delete:");
			list.DeleteAnodeByValue(sc.nextInt());
			break;
		case 6:
			System.out.println("thanks for using this");
			break;
		default :
			System.out.println("enter valid choice");
		}
		if(i==6)break;
		}//end of while
	}//end of main method
}//end of class
