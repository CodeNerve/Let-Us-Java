import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	static class node
	{
		int data;
		node left;
		node right;
		node(int data){
			this.data=data;
			left=null;
			right=null;
			
		}
	}
	static node root;
	//static node temp=root;
	static void insert(node temp,int data)
	{
		if(temp==null)
		{
			root=new node(data);
			return;
		}
		Queue<node> q =new LinkedList<>();
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.peek();
			q.remove();
			if(temp.left==null)
			{
				temp.left=new node(data);
				break;
			}
			else {
				q.add(temp.left);
			}
			if(temp.right==null)
			{
				temp.right=new node(data);
				break;
			}
			else {
				q.add(temp.right);
			}
			
		}
	}
	static void inorder(node temp)
	{
		if(temp==null) {
			return;
		}
		inorder(temp.left);
		System.out.println(temp.data);
		inorder(temp.right);
		
	}
	static void postorder(node temp)
	{
		if(temp==null) {
			return;
		}
		inorder(temp.left);
		inorder(temp.right);
		System.out.println(temp.data);
		
	}
	static void preorder(node temp)
	{
		if(temp==null) {
			return;
		}
		System.out.println(temp.data);
		inorder(temp.left);
		inorder(temp.right);
		
	}
	public static void main(String[] arg)
	{
		 root = new node(10);
	        root.left = new node(11);
	        root.left.left = new node(7);
	        root.right = new node(9);
	        root.right.left = new node(15);
	        root.right.right = new node(8);
	   // insert(root,10);
	    //insert(root,11);
	    //insert(root,10);
	    //insert(root,9);
	    //insert(root,7);
	   // insert(root,12);
	    //insert(root,15);
	    insert(root,12);
		System.out.println(" inorder traversal=");
		inorder(root);
		System.out.println(" postorder traversal=");
		postorder(root);
		System.out.println(" preorder traversal=");
		preorder(root);
	}

}
