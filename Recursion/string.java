import java.util.*;
public class ReverseString  
{      
    public String reverseString(String str)  
    {  
        if(str.isEmpty())  
        {    
            return str;  
        }   
        else   
        {  
            return reverseString(str.substring(1))+str.charAt(0);  
        }  
    }  
    
    public static void main(String[] args)   
    {  
        ReverseString ob = new ReverseString();  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println(ob.reverseString(str));   
    }  
}