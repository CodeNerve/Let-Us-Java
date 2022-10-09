package com.mycompany.noor;
import java.util.Scanner;
public class array_selection_char 
{//ascending   
    char arr[];
    int n,i,j;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit of array");
        n=sc.nextInt();
        arr=new char[n];
        System.out.println("enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
    }
    void display()
    {
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void selection()
    {
        char smallest;
        int pos;
        for(i=0;i<(n-1);i++)
        {
            smallest=arr[i];
            pos=i;
            for(j=(i+1);j<n;j++)
            {
                if(arr[j]<smallest)
                {
                    smallest=arr[j];
                    pos=j;
                }
            }
            arr[pos]=arr[i];
            arr[i]=smallest;
        }
    }
    public static void main(String args[])
    {
        array_selection_char obj=new array_selection_char();
        obj.input();
        obj.display();
        obj.selection();
        obj.display();
    }
}