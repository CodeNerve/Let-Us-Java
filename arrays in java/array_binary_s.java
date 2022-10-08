package com.mycompany.noor;
import java.util.Scanner;
public class array_binary_s 
{
 String arr[],ele;
    int n,i;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit of array");
        n=sc.nextInt();
        arr=new String[n];
        System.out.println("enter "+n+" elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("enter element to search");
        ele=sc.next();
    }
    void display()
    {
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void binary()
    {
        boolean flag=false;
        int first=0,last=n-1,mid=0;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(arr[mid].compareTo(ele)<0)
                first=mid+1;
            else if(arr[mid].compareTo(ele)>0)
                last=mid-1;
            else
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("found at index"+(mid+1));
        else
            System.out.println("not found");
    }
    public static void main(String args[])
    {
        array_binary_s obj=new array_binary_s();
        obj.input();
        obj.display();
        obj.binary();
    }   
}
