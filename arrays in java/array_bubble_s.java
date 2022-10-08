package com.mycompany.noor;
import java.util.Scanner;
public class array_bubble_s 
{//ascending
  void bubblesort()
    {
        String c[],temp;
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        c=new String[n];
        System.out.println("Enter "+n+" words");
        for(i=0;i<n;i++)
        {
            c[i]=sc.next();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-1);j++)
            {
                if(c[j].compareTo(c[j+1])>0)
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
        array_bubble_s obj=new array_bubble_s();
        obj.bubblesort();
    }
}