
import java.util.Scanner;
public class matrix_largest_row 
{
    int A[][];
    int n,i,j;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for n");
        n=sc.nextInt();
        System.out.println("enter values for matrix");
        A=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
   void rowLarge()
   {
       int cp,large;
       for(i=0;i<n;i++)
       {
           large=A[i][0];
           cp=0;
           for(j=0;j<n;j++)
           {
               if(A[i][j]>large)
               {
                   large=A[i][j];
                   cp=j;
               }
           }
           System.out.println("largest in"+(i+1)+"="+large+" in column"+cp);
       }
    }
   public static void main(String args[])
   {
       matrix_largest_row ob=new matrix_largest_row();
       ob.input();
       ob.display();
       ob.rowLarge();
   }
}