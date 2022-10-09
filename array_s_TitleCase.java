// output is wrong
package com.mycompany.noor;
import java.util.Scanner;
public class array_s_TitleCase
{
    String sent;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentence");
        sent=sc.nextLine();
    }
    void put()
    {
        String nwrd;
        Scanner sb=new Scanner(sent);
        while(sb.hasNext())
        {
            
            String wrd=sb.next();
            int x=wrd.length();
            char ch=wrd.charAt(0);
            String rest=wrd.substring(1,x);
            nwrd=((char)ch-32)+rest;
            System.out.print(nwrd+" ");
        }
    }
    public static void main(String args[])
    {
        array_s_TitleCase ob=new array_s_TitleCase();
        ob.input();
        ob.put();
    }
}