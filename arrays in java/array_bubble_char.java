
import java.util.Scanner;
public class array_bubble_char 
{//ascending
    void bubblesort()
    {
        char c[],temp;
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        c=new char[n];
        System.out.println("Enter "+n+" characters");
        for(i=0;i<n;i++)
        {
            c[i]=sc.next().charAt(0);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1);j++)
            {
                if(c[j]>c[j+1])
                {
                temp=c[j];
                c[j]=c[j+1];
                c[j+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(c[i]+" ");
    }
    public static void main(String args[])
    {
        array_bubble_char obj=new array_bubble_char();
        obj.bubblesort();
    }
}

