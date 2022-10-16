import java.util.Scanner;
import java.lang.Math;
class add1toeachDigit
{
  public static void main(String[] args)
  {
    // Write your code here
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int num=0,i=0;
    while(n!=0)
    {
      int r=n%10;
      if(r==9)
        r=0;
      else
        r+=1;
       num=num+r*(int)(Math.pow(10,i));
        i++;
        n=n/10;
        
    }
    System.out.println(num);
  }
}
