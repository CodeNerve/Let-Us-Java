import java.util.*;
class palindromicword
{
   public static void main()
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a word");
       String word=sc.nextLine();
       String word1="";
       int i,p;
       char chr;
       p=word.length();
       for(i=p;i>=0;i--)
       {
       chr=word.charAt(i);
       word1=word+chr;
    }
if(word.equals(word1))
System.out.println("palindromic word");
else
System.out.println("not a palindromic word");
}
}
       
       
       
   
