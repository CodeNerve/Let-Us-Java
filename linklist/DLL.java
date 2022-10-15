  class DLL{
     Node head;

     class Node{ 
        int val;
        Node next;
        Node prev;
         Node(int val)
        {
            this.val=val;
        }
         Node(int val,Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;

        }

    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
    }
    public void display()
    {
        Node node=head;
        Node last=null;
        while(node!=null)
        {
            System.out.print(node.val +" ->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.print("print in reverse");
        while(last!=null)
        {
            System.out.print(last.val+ "->");
            last=last.prev;
        }
        System.out.print("START");
    }
    public void insertLast(int val)
    {
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        while(last.next !=null)
        {
            last=last.next;

        }
        last.next=node;
        node.prev=last;


    }
    public Node find (int value)
    {
        Node node=head;
        while(node !=null)
        {
            if(node.val==value)
            {
                return node;

            }
            node=node.next;
        }
        return null;
    }
    public void insert(int after,int val)
    {
        Node p=find(after);
        if(p==null)
        {
            System.out.print("does not exist");
            return ;

        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next !=null)
        {
            node.next.prev=node;
        }

    }

    
    public static void main(String args[])
    {
        DLL list=new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertLast(78);
        list.insert(3,90);
        list.display();



    }


}