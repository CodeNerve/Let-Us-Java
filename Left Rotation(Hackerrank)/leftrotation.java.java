
import java.util.*;
public class leftrotation {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int n,i,d;
       System.out.println("Enter the size of the array");
        n=sc.nextInt();
       
        int a[]=new int[n];
       System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index from where you want to do left rotation");
        d=sc.nextInt();
       
        for(i=d;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        for(i=0;i<d;i++)
        {
            System.out.print(a[i] +" ");
            
        }
        
        


    }

}

