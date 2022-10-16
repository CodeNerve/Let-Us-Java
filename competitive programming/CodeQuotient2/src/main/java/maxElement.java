import java.util.Scanner;

public class maxElement {

	// Other imports go here
	
	
	  public static void main(String[] args)
	  {
	    // Write your code here
	    Scanner inp = new Scanner(System.in);
	    int[] a = new int[10];
	    for(int i=0;i<a.length;i++)
	      a[i] = inp.nextInt();
	    
	    int[] b = new int[10];
	    for(int i=(a.length-1),j=0;i>=0;i--)
	      b[j++]=a[i];
	    
	    for(int x:b)
	      System.out.println(x);
	    
	  }
	}
	


