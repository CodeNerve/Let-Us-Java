import java.util.Scanner;

public class TreeUse {
    //CALCULATE LARGEST ELEMENT
    public static int largest(TreeNode<Integer> root){
        if (root==null){
            return Integer.MIN_VALUE;

        }
        int ans=root.data;
        for(int i=0;i<root.children.size();i++){
            int childLargest=largest(root.children.get(i));
            if(childLargest>ans){
                ans=childLargest;
            }
        }
        return ans;

    }

    //CALCULATE NUMBER NODES
    public static int numNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count =1;
        for(int i=0; i<root.children.size();i++){
            count+=numNodes(root.children.get(i));

        }
        return count;
    }


    //TO TAKE INPUT
   public static TreeNode<Integer> takeInput(){
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter new node data ");
    n=s.nextInt();
    TreeNode<Integer>root=new TreeNode<Integer>(n);
    System.out.println("Enter no of children " +n);
    int childcount=s.nextInt();
    for(int i=0;i<childcount;i++){
        TreeNode<Integer> child =takeInput();
        root.children.add(child);
    }
    return root;

   } 

   //TO PRINT
   public static void print(TreeNode<Integer> root){
    String s=root.data +":";
    for(int i=0;i<root.children.size();i++){
        s=s+root.children.get(i).data+",";
    }
    System.out.println(s);
    for(int i=0;i<root.children.size();i++){
        print(root.children.get(i));
    }
    }

   //Void Main
    public static void main(String[] args){
        TreeNode<Integer> root=takeInput();
        System.out.println(numNodes(root));
        System.out.println(largest(root));
        
        print(root);
        // TreeNode<Integer> root=new TreeNode<Integer>(4);
        // TreeNode<Integer> node1=new TreeNode<Integer>(5);
        // TreeNode<Integer> node2=new TreeNode<Integer>(6);
        // TreeNode<Integer> node3=new TreeNode<Integer>(7);
        // TreeNode<Integer> node4=new TreeNode<Integer>(2);
        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        // System.out.println(root);


    }
    
} 
