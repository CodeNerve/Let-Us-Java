
import java.util.Scanner;
public class array_bubble_int
{//ascending
    void bubblesort()
    {
        int arr[];
        int i,j,n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("enter "+n+" numbers");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        array_bubble_int obj=new array_bubble_int();
        obj.bubblesort();
    }
}
