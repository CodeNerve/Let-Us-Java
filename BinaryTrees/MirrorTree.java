import java.util.*;
public class MirrorTree{
static class Node{
	int data;
	Node left;Node right;
	Node(int data){
		this.data=data;
		this.left=null;this.right=null;
	}
}
static Node root;
public static void insert(Node temp,int data) {
	Queue<Node>q=new LinkedList<Node>();
	q.add(temp);
	while(!q.isEmpty()) {
		temp=q.peek();
		q.remove();
		if(temp.left==null) {
			temp.left=new Node(data);
			break;
		}else {
			q.add(temp.left);
		}
		if(temp.right==null) {
			temp.right=new Node(data);
			break;
		}else {
			q.add(temp.right);
		}
	}
	
}
public static void inorder( Node node) 
{ 
    if (node == null) 
        return; 
    
    inorder(node.left); System.out.print( node.data + " "); 
    inorder(node.right); 
} 
public static void MirrorTree(Node node) {
	Queue<Node>s=new LinkedList<>();
	s.add(node);
	while(!s.isEmpty()){
		Node curr=s.peek();;
		s.remove();
		Node temp=curr.left;
		curr.left=curr.right;
		curr.right=temp;
		if(curr.left!=null) {
			s.add(curr.left);
		}if(curr.right!=null) {s.add(curr.right);}}
	}
public static void main(String[]args) {
	root =new Node(10);				//   MIRROR TREE				     ORIGINAL TREE
	insert(root,20);				//			  10					   	  10
	insert(root,30); 				//		30		     20			    20		     30
	insert(root,40);				//	70		60   50 	 40    	40      50	 60       70
	insert(root,50);
	insert(root,60);
	insert(root,70);
	MirrorTree(root);
}
}

