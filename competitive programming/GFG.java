//Java Program to generate hailstone numbers
//Calculate steps required to reduce them to 1
import java.util.*;
class GFG{
 static int c;
 //Function to print hailstone numbers and to calculate the number of steps required
 static int HailstoneNumbers(int N)
 {
  System.out.println(N+" ");
  if(N==1 && c==0){
  //N is initially 1.
  return c;
 }
 else if(N==1 && c!=0){
 //N is reduced to 1.
  c++;
  return c;
 }
  else if(N%2==0){
  //If N is even.
  c++;
  HailstoneNumbers(N/2);
 }
  else if(N%2!=0){
  //Nis odd.
  c++;
  HailstoneNumbers(3*N+1);
 }
 return c;
}
//Driver code
public static void main(String[] args)
{
 int N=7;
 int x;
 //Function to generate Hailstone Numbers
 x=HailstoneNumbers(N);
 //Output: Number of steps
 System.out.println();
 System.out.println("Number of steps:" + x);
 }
}