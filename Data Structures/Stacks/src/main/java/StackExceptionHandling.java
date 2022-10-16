// Stack implementation using exception handling to manage underflow and overflow conditions
class StackException extends Exception {

    StackException( String message)
    {
    super(message);
    }
}

class ArrayStack {
    public static int[] item;
    public static int stackTop;

    ArrayStack( )
    {
        item = new int[4];
        stackTop=-1;
    }

    static void push(int x) throws StackException {
        if (stackTop==item.length-1) {
            throw new StackException("Stack overflow");
        }
        stackTop++;
        item[stackTop] = x;
    }

    static void pop( ) throws StackException {
        int returnItem;
        if ( stackTop==-1) {
            throw new StackException("Stack underflow");
        }
        returnItem = item[stackTop--];
        System.out.println(returnItem);
    }
}

public class StackExceptionHandling {
  public static void main( String args[] ) {

    ArrayStack s=new ArrayStack();
    try
    {
        for(int i=0;i<4;i++)
            s.push(i);
        for(int j=0;j<5;j++)
            s.pop();
    }

    catch ( StackException e ) {
        System.out.println("Error detected: " + e.getMessage() );
    }
  }
}
