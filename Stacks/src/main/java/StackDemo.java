import java.util.*;
import java.io.*;
import java.util.Random;
 
public class StackDemo {
    public static void main(String args[])
    {


        Random rand = new Random();

        // create empty Stack
        Stack<Integer> stack = new Stack<Integer>();
 
        // Use add() method to add elements
        for (int i=0;i<5;i++) {
            stack.push(rand.nextInt(50));
        }
 
        System.out.println("Init Stack: " + stack);
 
        // Looks at the object at the top of this stack without removing it from the stack.
        System.out.println("peek element: "
                           + stack.peek());

        // get & remove elements using pop() method
        System.out.println("pop element: "
                           + stack.pop());
       // display the Stack after pop 
        System.out.println("Stack after pop "
                           + stack);
      
      // get & remove elements using pop() method
        System.out.println("pop element: "
                           + stack.pop());                   
        // display the Stack after pop 
        System.out.println("Stack after pop "
                           + stack);
    }
}
