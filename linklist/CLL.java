class CLL
{
    Node head;
    Node tail;
    CLL()
    {
        this.head=null;
        this.tail=null;
    }
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display()
    {
        Node node=head;
        if(head != null)
        {
            do{
                System.out.print(node.val + " ->");
                node= node.next;
            } while(node !=head);

        }
        System.out.print("HEAD");
    } 
    public void delete(int val)
    {
        Node node=head;
        if(node==null)
        {
            return ;
            
        }
        if (node.val==val)
        {
            head=head.next;
            tail.next=head;
            return ;

        }
        do{
            Node n =node.next;
            if(n.val==val)
            {
                node.next=n.next;
                break;
            }
            node=node.next;
        }
            while(node !=head);
        
    }
    public static void main(String args[])
    {
        CLL list= new CLL();
        list.insert(23);
        list.insert(34);
        
        list.insert(78);
        list.delete(34);
        list.display();

        
    }
}