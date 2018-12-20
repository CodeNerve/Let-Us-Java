
public class Node {


	Node left,right;
	int data;
	
	
	public Node(int data) {
		
		this.data = data;
		
	}


	public void insert(int value) {
		
		if(value<data) {
			
			
			if(left == null)
				left = new Node(value);
			
			else 
				left.insert(value);
		
		}
		
		else {
			
			
			if(right == null)
				right = new Node(value);
			
			else
				right.insert(value);
			
		}
		
	
	}
	
	public boolean contains(int value) { 
		
		if( data == value)
			return true;
		
		else if(value < data) {
			
			if(left == null)
				return false;
			
			else
				return left.contains(value);
			
		}
		
		else {
			
			if(right == null)
				return false;
			
			else
				return right.contains(value);
			
		}	
		
	}
	
	public void printInOrder() { 
		
		if(left!=null)
			left.printInOrder();
		
		System.out.println(this.data);
		
		if(right!=null)
			right.printInOrder();
		
		
	}
	
	public void printPreOrder() { 
		
		System.out.println(this.data);
		
		if(left!=null)
			left.printInOrder();
		
		if(right!=null)
			right.printInOrder();
		
		
	}
	
	public void printPostOrder() { 
		
		if(left!=null)
			left.printInOrder();
		
		if(right!=null)
			right.printInOrder();
		
		System.out.println(this.data);
		
	}
	
	public int getValue(Node node) {
		return node.data;
	}
	
	public Node deleteRec(Node root, int value) {
		
		if(!contains(value))
			return null;
	
		if (root == null)  
			return root; 
	  
		if (value < root.data) 
			root.left = deleteRec(root.left, value); 
	
	
		else if (value > root.data) 
			root.right = deleteRec(root.right, value); 

	
		else { 
        
    	
			if (root.left == null) 
				return root.right; 
        
        
			else if (root.right == null) 
				return root.left; 
        
			root.data = minValue(root.right); 

			root.right = deleteRec(root.right, root.data); 
		} 

		return root; 	
	}

	public int minValue(Node root) { 
	
		int minv = root.data; 
    
		while (root.left != null) {
    	
			minv = root.left.data; 
			root = root.left; 
        
		} 
    
		return minv; 
	} 
}
