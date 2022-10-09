
import java.util.Scanner;
public class matrix_border 
{
 int A[][],m,n,i,j,k=0;
 int arr[]=new int[20];
 void input()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no. of rows and columns");
     n=sc.nextInt();
     m=sc.nextInt();
     A=new int[m][n];
     System.out.println("enter elements"+(m*n));
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
             A[i][j]=sc.nextInt();
     }
 }
 void display()
 {
     System.out.println("matrix");
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
            System.out.print(A[i][j]+" ");
      System.out.println();
     }
 }
 void borderPut()
 {
    
    for(i=0;i<n;i++)
     {
         for(j=0;j<n;j++)
         {
           if(i == 0 || i == (n-1))
           {
               arr[k++]=A[i][j];
           }
           if( j == 0||j==(n-1))
           {
               arr[k++]=A[i][j];
           }
         }//end of j loop
     }    
 }
 void sort()
 {
     //bubble sort
     for(int x=0;x<k;x++)
     {
         for(int y=0;y<(k-1);y++)
         {
             if(arr[y]>arr[y+1])
             {
                 int temp=arr[y];
                 arr[y]=arr[y+1];
                 arr[y+1]=temp;
             }
         }
     }//end of bubble sort
     int s=0;
     i=0;
     for(j=0;j<n;j++)
     {
         A[i][j]=arr[s++];
     }
     j=n-1;
     for(i=1;i<m;i++)
     {
         A[i][j]=arr[s++];
     }
     i=m-1;
     for(j=n-2;j>=0;j--)
     {
         A[i][j]=arr[s++];
     }
     j=0;
     for(i=m-2;i>=1;i--)
     {
         A[i][j]=arr[s++];
     } 
 }
 void borderPrint()
 {
     System.out.println("border");
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
         {
           if(i==0||j==0||i==(m-1)||j==(n-1))
               System.out.print(A[i][j]+" ");
           else
               System.out.print(" ");
         }
          System.out.println();
     }
 }
 public static void main(String args[])
 {
     matrix_border ob=new matrix_border();
     ob.input();
     ob.display();
     ob.borderPut();
     ob.sort();
     ob.display();
     ob.borderPrint();
 }
}