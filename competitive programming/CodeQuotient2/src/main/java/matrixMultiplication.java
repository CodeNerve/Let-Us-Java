import java.util.Scanner;

public class matrixMultiplication {

	  public static void main(String[] args)
	  {
	    // Write your code here
	    Scanner inp = new Scanner(System.in);
	    int t = inp.nextInt();
	    
	    while(t!=0)
	    {
	      int r1 = inp.nextInt();
	      int c1 = inp.nextInt();
	      int[][] A = new int[r1][c1];
	      for(int i=0;i<A.length;i++)
	        for(int j=0;j<A[i].length;j++)
	          A[i][j]=inp.nextInt();
	      
	      int r2 = inp.nextInt();
	      int c2 = inp.nextInt();
	      int[][] B = new int[r2][c2];
	      for(int i=0;i<B.length;i++)
	        for(int j=0;j<B[i].length;j++)
	          B[i][j]=inp.nextInt();
	      
	      int[][] C = new int[r1][c2];
	      
	      for(int i=0;i<r1;i++)
	      {
	        for(int j=0;j<c2;j++)
	        {C[i][j]=0;
	          for(int k=0;k<c1;k++)
	          {
	            C[i][j]=C[i][j]+A[i][k]*B[k][j];
	          }
	         System.out.print(C[i][j]+" ");
	        }
	        System.out.println();
	      }
	      
	      t--;
	    }
	  }
}