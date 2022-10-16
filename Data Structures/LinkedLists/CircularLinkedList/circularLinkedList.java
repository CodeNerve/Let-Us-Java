package LinkedList.CircularLinkedList;

import java.util.Scanner;

public class circularLinkedList {

    //Creating the Last object of type Node.
    private Node head;
    private Node tail;
    private int length;

//    creating the Node Class
    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

//    Constructor of circularLinkedList type
    public circularLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

//    Method to get the length of the list
    public int getLength(){
        return length;
    }


//    Method to check whether the List is empty or not.
    public boolean isEmpty(){
        return length == 0;
    }

//    Function to create a doubly linked list
    public void createList(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        length++;
    }

//    Function to display the circularLinkedList
    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("List is Empty");
        }else{
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            }while(current != head);
        }
    }

//    Method to delete the element from the circular linked list
    public void deleteElement(){
        if(head == null){
            System.out.println("Empty List");
        }
        Node temp = head;

        head = temp.next;
        temp.next = null;
        tail.next = head;
        length--;

    }
//    main method starts here
    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Please enter your choice \n" +
                    "Press 0 To exit \n" +
                    "press 1 to inset Into List \n" +
                    "press 2 to display the list \n" +
                    "Press 3 to get the length of the list \n" +
                    "Press 4 to delete from List");
            int choice = sc.nextInt();
            switch (choice){

                case 0-> System.exit(0);
                case 1 -> {
                    System.out.println("PLease Enter the data : ");
                    int data = sc.nextInt();
                    cll.createList(data);
                }

                case 2 -> cll.display();

                case 3 -> System.out.println("Length of the List is " + cll.getLength());

                case 4 -> {
                    cll.deleteElement();
                }

                default -> System.out.println("Wrong Input!! Please Try Again");
            }
        }
    }
}
